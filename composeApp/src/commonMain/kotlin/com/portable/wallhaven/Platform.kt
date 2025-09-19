package com.portable.wallhaven

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform