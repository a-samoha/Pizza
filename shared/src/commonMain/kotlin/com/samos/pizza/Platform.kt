package com.samos.pizza

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform