package com.kotlearn.hamidhosen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform