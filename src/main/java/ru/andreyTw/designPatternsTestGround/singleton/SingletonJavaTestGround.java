package ru.andreyTw.designPatternsTestGround.singleton;

import static ru.andreyTw.designPatternsTestGround.singleton.MySingletonJava.getMySingletonJavaInstance;

public class SingletonJavaTestGround {
    public static void main(String[] args) {
//        MySingletonJava mySingletonJavaOne = new MySingletonJava();
//        MySingletonJava mySingletonJavaTwo = new MySingletonJava();
//        MySingletonJava mySingletonJavaThree = new MySingletonJava();
        MySingletonJava mySingletonJavaOne = getMySingletonJavaInstance();
        MySingletonJava mySingletonJavaTwo = getMySingletonJavaInstance();
        MySingletonJava mySingletonJavaThree = getMySingletonJavaInstance();
        System.out.println(mySingletonJavaOne.mySingletonJavaNumberOfInstance);
        System.out.println(mySingletonJavaTwo.mySingletonJavaNumberOfInstance);
        System.out.println(mySingletonJavaThree.mySingletonJavaNumberOfInstance);
        System.out.println(mySingletonJavaOne == mySingletonJavaTwo);
    }
}


