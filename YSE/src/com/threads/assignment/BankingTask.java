package com.threads.assignment;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class BankingTask implements Runnable {
    private String taskName;
    private int priority;

    public BankingTask(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    @Override
    public void run() {
        // Set priority for current thread
        Thread.currentThread().setPriority(priority);

        System.out.println("Executing Task: " + taskName +
                " | Priority: " + priority +
                " | Thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000); // Simulate task time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed Task: " + taskName +
                " | Thread: " + Thread.currentThread().getName());
    }
}

