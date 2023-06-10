package ru.andreyTw.designPatternsTestGround.singleton

//class MySingleton {
class MySingletonKotlin private constructor() {
    var mySingletonKotlinNumberOfInstance = instanceCounter

    init {
        instanceCounter++
    }

    companion object {
        private var instanceCounter: Int = 1
        private var uniqueSingletonKotlinInstance: MySingletonKotlin? = null

        fun getMySingletonKotlinInstance(): MySingletonKotlin {
            if (uniqueSingletonKotlinInstance == null) {
                uniqueSingletonKotlinInstance = MySingletonKotlin()
            }
            return uniqueSingletonKotlinInstance!!
        }
    }
}