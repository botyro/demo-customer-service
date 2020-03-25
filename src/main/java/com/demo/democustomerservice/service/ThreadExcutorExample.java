package com.demo.democustomerservice.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

@Service
public class ThreadExcutorExample {

    @Async
    public void createUserWithDefaultExecutor() {
        System.out.println("Hello async method ");
        count();
        System.out.println("Currently Executing thread name - " + Thread.currentThread().getName());
    }

    @Async
    public void count() {
        try {
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.println("Currently Executing thread name - " + Thread.currentThread().getName());
                System.out.println("count : " + i);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Async
    public void count2() {
        try {
            int i = 0;
            for (i = 0; i < 5; i++) {
                System.out.println("Currently Executing thread name - " + Thread.currentThread().getName());
                System.out.println("count2 : " + i);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Async
    public void count3() {
        try {
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.println("Currently Executing thread name - " + Thread.currentThread().getName());
                System.out.println("count3 : " + i);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
