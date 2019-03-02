package com;

import java.util.concurrent.*;

/**
 * Created by caowei on 2019/2/15.
 */
public class App {

    private static ExecutorService es = Executors.newFixedThreadPool(100);
    private static CompletionService cs = new ExecutorCompletionService(es);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;i < 1000 ;i++){
            ThreadCreate create = new ThreadCreate();
            Thread thread = new Thread(create);
            es.submit(thread);
        }
        System.out.println("输出");
        for (int i = 0;i < 1000 ;i++){
            cs.take();
        }
    }
}
