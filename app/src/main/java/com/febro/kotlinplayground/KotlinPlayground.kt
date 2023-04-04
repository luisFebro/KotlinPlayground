package com.febro.kotlinplayground

class KotlinPlayground {

    fun updateWeather(degrees: Int) {
        val(description, color) = when {
            degrees < 10 -> "cold" to "BLUE"
            degrees < 25 -> "mild" to "ORANGE"
            else -> "hot" to "RED"
        }
    }
}