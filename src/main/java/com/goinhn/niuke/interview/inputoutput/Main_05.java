package com.goinhn.niuke.interview.inputoutput;

import java.util.Scanner;

public class Main_05 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int lineNumber = scanner.nextInt();
       for(int i = 0; i < lineNumber; i++) {
           int sum = 0;
           int length = scanner.nextInt();
           for(int j = 0; j < length; j++) {
                sum += scanner.nextInt();
           }
           System.out.println(sum);
       }
    }

}
