package com.cqx.complie.synchronizedddd;

/**
 * Created by BG307435 on 2018/7/26.
 */
public class King {

    private static String s;

    public synchronized void sayHi(String xxx) {
        System.out.println("hi");
        s = xxx;
    }
}
