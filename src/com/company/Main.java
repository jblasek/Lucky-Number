package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    //make a loop that makes an anonomous lucky number into the current lucky numbeer and resets the num1

        System.out.println("Hi! What is your name?");

        luckyNumber num1 = new luckyNumber("");
        Scanner kbReader = new Scanner(System.in);

        num1.name = kbReader.next();
        int ranNum1 = num1.perfectRandom();

        System.out.println(num1.name + "'s luck number is " + ranNum1);


        boolean turnOff = false;

        while (turnOff == false) {
            System.out.println("Do you want another lucky number? If so enter 2. If you want to see your current number old number press 1. If you want to stop press 0.");
            int x = kbReader.nextInt();

            if (x == 2) {
                System.out.println("Hi again! What is your name?");
                num1.name = kbReader.next();
                ranNum1 = num1.perfectRandom();

                System.out.println(num1.name + "'s luck number is " + ranNum1);
                }

            else if (x == 1) {
                System.out.println(num1.name + "'s luck number is " + ranNum1);

            }

            else if (x == 0){
                System.out.println("Goodbye!");
                turnOff = true;
            }
        }

    }
}
