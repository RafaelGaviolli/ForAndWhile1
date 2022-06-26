package br.com.rgaviolli.forewhile;

import java.util.Scanner;

public class MultWhile {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Do you want to generate the multiplication table of some number? ");
        String answer = s.next();

        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Type some number to generate the multiplication table: ");
            int num = s.nextInt();
            for (int i = 0; i<=10;i++) {
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Do you want to generate another multiplication table? ");
            answer = s.next();
        }

        System.out.println("Thank-you.");
    }

}
