package ru.andreyTw.designPatternsTestGround.singleton

import ru.andreyTw.designPatternsTestGround.singleton.MySingletonKotlin.Companion.getMySingletonKotlinInstance

fun main() {
//    val mySingletonOne = MySingleton()
//    val mySingletonTwo = MySingleton()
//    val mySingletonThree = MySingleton()
    val mySingletonOne = getMySingletonKotlinInstance()
    val mySingletonTwo = getMySingletonKotlinInstance()
    val mySingletonThree = getMySingletonKotlinInstance()
    println(mySingletonOne.mySingletonKotlinNumberOfInstance)
    println(mySingletonTwo.mySingletonKotlinNumberOfInstance)
    println(mySingletonThree.mySingletonKotlinNumberOfInstance)
    println(mySingletonOne == mySingletonTwo)
}