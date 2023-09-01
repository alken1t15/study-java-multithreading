package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();

//        MyRunnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();

//        Thread thread = new Thread(() -> {
//
//            System.out.println("Выполняется логика в потоке используя лямбда-выражения");
//
//        });
//        thread.start();

//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        executor.submit(() -> {
//            System.out.println("Выполняется логика в потоке созданном через ExecutorService");
//        });
//
//        executor.shutdown();

        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "Выполняется логика в потоке созданном через FutureTask и отправляется результат";
        });

        Thread thread = new Thread(futureTask);
        thread.start();

        String result = futureTask.get();
        System.out.println(result);
        System.out.println("Hello world!");
    }
}