package com.ios18.appstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Today
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ios18.appstore.ui.Bg
import com.ios18.appstore.ui.Blue
import com.ios18.appstore.ui.GrayText
import com.ios18.appstore.ui.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colorScheme = lightColorScheme(primary = Blue, background = Bg, surface = Color.White)
            ) { AppStoreApp() }
        }
    }
}

private data class Tab(val route: String, val label: String, val icon: ImageVector)

@Composable
fun AppStoreApp() {
    val nav = rememberNavController()
    val tabs = listOf(
        Tab("today", "Сегодня", Icons.Filled.Today),
        Tab("games", "Игры", Icons.Filled.SportsEsports),
        Tab("apps", "Приложения", Icons.Filled.Widgets),
        Tab("arcade", "Аркада", Icons.Filled.Gamepad),
        Tab("search", "Поиск", Icons.Filled.Search)
    )
    val backStack by nav.currentBackStackEntryAsState()
    val route = backStack?.destination?.route
    val showBar = tabs.any { it.route == route }

    Scaffold(
        containerColor = Bg,
        bottomBar = {
            if (showBar) {
                NavigationBar(containerColor = Color.White) {
                    tabs.forEach { tab ->
                        NavigationBarItem(
                            selected = route == tab.route,
                            onClick = {
                                nav.navigate(tab.route) {
                                    popUpTo(nav.graph.findStartDestination().id) { saveState = true }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = { Icon(tab.icon, null) },
                            label = { Text(tab.label, fontSize = 10.sp) },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = Blue,
                                selectedTextColor = Blue,
                                indicatorColor = Color.Transparent,
                                unselectedIconColor = GrayText,
                                unselectedTextColor = GrayText
                            )
                        )
                    }
                }
            }
        }
    ) { padding ->
        NavHost(nav, startDestination = "today", modifier = Modifier.padding(padding)) {
            composable("today") { TodayScreen(onOpen = { nav.navigate("app/$it") }) }
            composable("games") { GamesScreen(onOpen = { nav.navigate("app/$it") }) }
            composable("apps") { AppsScreen(onOpen = { nav.navigate("app/$it") }) }
            composable("arcade") { ArcadeScreen(onOpen = { nav.navigate("app/$it") }) }
            composable("search") { SearchScreen(onOpen = { nav.navigate("app/$it") }) }
            composable("app/{pkg}") { entry ->
                AppDetailScreen(
                    pkg = entry.arguments?.getString("pkg") ?: "",
                    onBack = { nav.popBackStack() }
                )
            }
        }
    }
}