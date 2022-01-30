package io.github.furrypet.fur.common

expect class Platform() {
    val platform: String

    fun login(email: String, password: String)
}