package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hi! What is your name?");
        luckyNumber num1 = new luckyNumber("");
        Scanner kbReader = new Scanner(System.in);
        num1.name = kbReader.next();
        int ranNum1 = num1.perfectRandom();
        System.out.println(num1.name + "'s luck number is........." + ranNum1);
        //make a while loop that lasts forever that will be a if an else statement to keep going or to stop
    }
}
