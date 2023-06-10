package ru.andreyTw.designPatternsTestGround.singleton;

public class MySingletonJava {
    private static int instanceCounter = 1;
    public int mySingletonJavaNumberOfInstance;
    private static MySingletonJava uniqueSingletonJavaInstance;

//    public MySingletonJava() {
    private MySingletonJava() {
        mySingletonJavaNumberOfInstance = instanceCounter;
        instanceCounter++;
    }

    public static MySingletonJava getMySingletonJavaInstance() {
        if (uniqueSingletonJavaInstance == null) {
            uniqueSingletonJavaInstance = new MySingletonJava();
        }
        return uniqueSingletonJavaInstance;
    }
}
