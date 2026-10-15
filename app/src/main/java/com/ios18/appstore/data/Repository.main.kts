#!/usr/bin/env kotlin
package com.ios18.appstore.data

import androidx.compose.ui.graphics.Color

data class AppItem(
    val name: String,
    val developer: String,
    val category: String,
    val emoji: String,
    val color: Color,
    val rating: Double,
    val ratingCount: String,
    val age: String,
    val size: String,
    val description: String,
    val playPackage: String
)

data class Story(val label: String, val title: String, val app: AppItem)

object Repository {
    val allApps = listOf(
        AppItem("Telegram", "Telegram FZ-LLC", "Соцсети", "✈️", Color(0xFF2AABEE), 4.3, "1,4 млн оценок", "4+", "128 МБ", "Telegram — быстрый мессенджер: чаты, каналы, звонки и файлы до 2 ГБ.", "org.telegram.messenger"),
        AppItem("WhatsApp", "WhatsApp LLC", "Соцсети", "💬", Color(0xFF25D366), 4.2, "5,7 млн оценок", "4+", "85 МБ", "Простой и надёжный мессенджер со сквозным шифрованием.", "com.whatsapp"),
        AppItem("Instagram", "Instagram", "Соцсети", "📷", Color(0xFFE1306C), 4.0, "3,1 млн оценок", "12+", "256 МБ", "Фото, истории и видео от друзей и любимых блогеров.", "com.instagram.android"),
        AppItem("TikTok", "TikTok Pte. Ltd.", "Медиа", "🎵", Color(0xFF161616), 4.4, "4,8 млн оценок", "12+", "310 МБ", "Короткие видео, подобранные специально для тебя.", "com.zhiliaoapp.musically"),
        AppItem("YouTube", "Google LLC", "Видео", "▶️", Color(0xFFFF0000), 4.1, "8,9 млн оценок", "12+", "128 МБ", "Смотрите видео, подписывайтесь на каналы, делитесь с друзьями.", "com.google.android.youtube"),
        AppItem("Spotify", "Spotify AB", "Музыка", "🎧", Color(0xFF1DB954), 4.4, "2,2 млн оценок", "12+", "95 МБ", "Миллионы треков и подкастов в одном приложении.", "com.spotify.music"),
        AppItem("Netflix", "Netflix, Inc.", "Видео", "🎬", Color(0xFFE50914), 4.0, "1,8 млн оценок", "16+", "42 МБ", "Сериалы и фильмы онлайн в высоком качестве.", "com.netflix.mediaclient"),
        AppItem("Twitch", "Twitch Interactive", "Видео", "🟣", Color(0xFF9146FF), 4.3, "740 тыс. оценок", "16+", "88 МБ", "Стримы любимых игр и киберспортивные турниры.", "tv.twitch.android.app"),
        AppItem("Discord", "Discord Inc.", "Соцсети", "🎮", Color(0xFF5865F2), 4.2, "980 тыс. оценок", "12+", "120 МБ", "Голосовые и текстовые чаты для геймеров и сообществ.", "com.discord"),
        AppItem("VK", "VK", "Соцсети", "🔵", Color(0xFF0077FF), 4.1, "3,5 млн оценок", "12+", "180 МБ", "Общение, музыка, видео и новости в одном приложении.", "com.vkontakte.android"),
        AppItem("Wildberries", "Wildberries", "Покупки", "🛍", Color(0xFFCB11AB), 4.6, "2,9 млн оценок", "4+", "150 МБ", "Миллионы товаров с доставкой и примеркой.", "ru.wildberries"),
        AppItem("Ozon", "Internet Solutions LLC", "Покупки", "📦", Color(0xFF005BFF), 4.6, "2,4 млн оценок", "4+", "160 МБ", "Всё, что нужно, — от электроники до продуктов.", "ru.ozon.app.android"),
        AppItem("Яндекс", "Яндекс", "Утилиты", "🚕", Color(0xFFFC3F1D), 4.4, "1,1 млн оценок", "4+", "210 МБ", "Поиск, погода, карты, такси и Алиса — всё в одном.", "ru.yandex.searchplugin"),
        AppItem("Duolingo", "Duolingo", "Образование", "🦉", Color(0xFF58CC02), 4.7, "1,6 млн оценок", "4+", "65 МБ", "Учи языки бесплатно — 5 минут в день.", "com.duolingo"),
        AppItem("Shazam", "Apple Inc.", "Музыка", "🎶", Color(0xFF0088FF), 4.8, "3,3 млн оценок", "4+", "35 МБ", "Узнавай любую музыку за секунду.", "com.shazam.android"),
        AppItem("Minecraft", "Mojang", "Игры", "⛏", Color(0xFF5D7C15), 4.5, "3,9 млн оценок", "4+", "750 МБ", "Строй, добывай и выживай в бесконечном мире блоков.", "com.mojang.minecraftpe"),
        AppItem("Roblox", "Roblox Corporation", "Игры", "🧱", Color(0xFFE2231A), 4.4, "6,2 млн оценок", "9+", "180 МБ", "Миллионы игр, созданных самими игроками.", "com.roblox.client"),
        AppItem("Brawl Stars", "Supercell", "Игры", "💥", Color(0xFFF5A623), 4.2, "4,1 млн оценок", "9+", "550 МБ", "Динамичные битвы 3 на 3 и королевская битва.", "com.supercell.brawlstars"),
        AppItem("Clash Royale", "Supercell", "Игры", "👑", Color(0xFF4A90D9), 4.3, "3,7 млн оценок", "9+", "620 МБ", "Колоды, башни и дуэли в реальном времени.", "com.supercell.clashroyale"),
        AppItem("Genshin Impact", "COGNOSPHERE PTE. LTD.", "Игры", "🗡", Color(0xFF7285C4), 4.3, "2,6 млн оценок", "12+", "380 МБ", "Огромный открытый мир и магические приключения.", "com.miHoYo.GenshinImpact"),
        AppItem("Standoff 2", "AXLEBOLT", "Игры", "🔫", Color(0xFF232323), 4.6, "3,4 млн оценок", "16+", "1,2 ГБ", "Легендарный мобильный шутер.", "com.axlebolt.standoff2"),
        AppItem("Among Us", "Innersloth LLC", "Игры", "👨‍🚀", Color(0xFFC51111), 4.1, "2,8 млн оценок", "9+", "230 МБ", "Найди предателя на корабле.", "com.innersloth.spacemafia"),
        AppItem("Clash of Clans", "Supercell", "Игры", "🏰", Color(0xFF7BB661), 4.6, "5,5 млн оценок", "9+", "680 МБ", "Строй деревню и веди клан к победе.", "com.supercell.clashofclans")
    )

    val topApps = allApps.filter { it.category != "Игры" }
    val topGames = allApps.filter { it.category == "Игры" }

    fun byPkg(pkg: String) = allApps.firstOrNull { it.playPackage == pkg }

    val todayStories = listOf(
        Story("ВЫБОР РЕДАКЦИИ", "Приложение дня", byPkg("org.telegram.messenger")!!),
        Story("СЕЙЧАС В ТРЕНДЕ", "Битвы 3 на 3", byPkg("com.supercell.brawlstars")!!),
        Story("ОБЯЗАТЕЛЬНО ПОСМОТРЕТЬ", "Вечер с сериалом", byPkg("com.netflix.mediaclient")!!),
        Story("УЧИМСЯ НОВОМУ", "5 минут в день", byPkg("com.duolingo")!!)
    )

    val gameStory = Story("ВЫБОР РЕДАКЦИИ", "Игра недели", byPkg("com.miHoYo.GenshinImpact")!!)
    val appStory = Story("ПОЧЕМУ СТОИТ ПОПРОБОВАТЬ", "Твой новый чат", byPkg("com.whatsapp")!!)
}
