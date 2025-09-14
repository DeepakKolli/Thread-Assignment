package com.threads.assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankingSystemSimulation {

	public static void main(String[] args) {
        // Fixed thread pool (like bank staff)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // High-priority tasks
        executor.execute(new BankingTask("Fraud Detection", Thread.MAX_PRIORITY));
        executor.execute(new BankingTask("Transaction Validation", Thread.MAX_PRIORITY));

        // Medium-priority tasks
        executor.execute(new BankingTask("Balance Update", Thread.NORM_PRIORITY));
        executor.execute(new BankingTask("Account Notification", Thread.NORM_PRIORITY));

        // Low-priority tasks
        executor.execute(new BankingTask("Logging", Thread.MIN_PRIORITY));
        executor.execute(new BankingTask("Analytics", Thread.MIN_PRIORITY));
        executor.execute(new BankingTask("Report Generation", Thread.MIN_PRIORITY));

        // Shutdown after tasks are finished
        executor.shutdown();
    } 
}
