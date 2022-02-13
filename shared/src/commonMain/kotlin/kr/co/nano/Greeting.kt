package kr.co.nano

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}