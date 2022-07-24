package com.company;

import java.time.Duration;
import java.time.Instant;

public class CountThread
{
    public static void main(String[] args)
    {
        Runnable r = new Runnable() {
            Instant now = Instant.now();
            Instant later = Instant.now();


            @Override
            public void run()
            {
                String name = Thread.currentThread().getName();
                int count = 0;
                while (true) {
                    System.out.println(name + ": " + count++);
                    later = Instant.now();
                    if(Duration.between(now, later).toSeconds() > 10) {
                        System.out.println("10 seconds elpased existing");
                        break;
                    }
                }
            }
        };
        Thread thdA = new Thread(r);
        Thread thdB = new Thread(r);
        thdA.start();
        thdB.start();
    }
}