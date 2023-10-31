package com.example.p31concurrencia;

import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class PrintTask implements Runnable{
    private static  final SecureRandom generator = new SecureRandom();
    private final int sleeptTime;
    private final String taskName;

    public PrintTask(String taskName){
        this.taskName = taskName;
        sleeptTime = generator.nextInt(5000);
    }

    @Override
    public void run(){
        try{
            System.out.printf("%s going to sleep for %d miliseconds %n",
                    taskName.sleeptTime);
            Thread.sleep(sleeptTime);
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("%s done sleeping %n". taskNmae);
    }
}
