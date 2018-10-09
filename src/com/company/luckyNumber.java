package com.company;

/**
 * Created by jb838 on 10/9/18.
 */

public class luckyNumber {

    double number = Math.random();
    String name;

    public luckyNumber (String n) {
    name = n;
    }

    public int perfectRandom () {
        int ln = (int)Math.pow((int)(number * 100), 2);
        return ln;
    }
}
