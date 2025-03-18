package com.hamidhosen.kotlinproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform