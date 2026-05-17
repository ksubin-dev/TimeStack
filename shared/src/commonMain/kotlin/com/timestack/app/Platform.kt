package com.timestack.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform