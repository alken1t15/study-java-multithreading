package org.example;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Выполняется логика в потоке реализующем интерфейс Runnable");
    }
}
