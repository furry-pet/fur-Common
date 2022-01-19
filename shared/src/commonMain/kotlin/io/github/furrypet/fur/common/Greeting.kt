package io.github.furrypet.fur.common

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}