package com;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

    private static AtomicInteger nextIndex = new AtomicInteger();

    private static int incrementAndGetModulo(int modulo) {
        for (; ; ) {
            int current = nextIndex.get();
            int next = (current + 1) % modulo;
            if (nextIndex.compareAndSet(current, next) && current < modulo)
                return current;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(incrementAndGetModulo(5));
    }
}
