package ru.andreyTw.designPatternsTestGround.singleton

import ru.andreyTw.designPatternsTestGround.singleton.MySingleton.Companion.getMySingleton

fun main() {
//    val mySingletonOne = MySingleton()
//    val mySingletonTwo = MySingleton()
//    val mySingletonThree = MySingleton()
    val mySingletonOne = getMySingleton()
    val mySingletonTwo = getMySingleton()
    val mySingletonThree = getMySingleton()
    println(mySingletonOne.numberOfInstance)
    println(mySingletonTwo.numberOfInstance)
    println(mySingletonThree.numberOfInstance)
    println(mySingletonOne == mySingletonTwo)
}