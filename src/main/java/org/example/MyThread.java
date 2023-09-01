package org.example;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Выполняется логика п потоке созданном как наследник Thread");
    }
}