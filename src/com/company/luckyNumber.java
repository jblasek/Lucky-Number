package com.company;

/**
 * Created by jb838 on 10/9/18.
 */

class luckyNumber {
     String name;

    public luckyNumber (String n) {
    name = n;
    }

    public int perfectRandom () {
        double number = Math.random();
        int ln = (int)Math.pow((int)(number * 100), 2);
        return ln;
    }

}
