package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void printMenu()
    {
        System.out.println("1. Show all states");
        System.out.println("2. Show the alphabet");
        System.out.println("3. Show the initial state");
        System.out.println("4. Show the final states");
        System.out.println("5. Show the transitions");
    }

    public static void main(String[] args) throws FileNotFoundException {
        FA fa = new FA();
        boolean ok = true;
        int cmd;
        Scanner console = new Scanner(System.in);

        fa.readFromFile();

        while (ok)
        {
            printMenu();
            cmd = console.nextInt();

            switch (cmd){
                case 1:
                {
                    System.out.println(fa.printStates());
                    break;
                }
                case 2:
                {
                    System.out.println(fa.printAlphabet());
                    break;
                }
                case 3:
                {
                    System.out.println(fa.printInitState());
                    break;
                }
                case 4:
                {
                    System.out.println(fa.printFinalStates());
                    break;
                }
                case 5:
                {
                    System.out.println(fa.printTransitions());
                    break;
                }
                default:
                {
                    ok = false;
                    break;
                }
            }
        }
    }
}
