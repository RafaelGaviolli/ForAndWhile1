package br.com.rgaviolli.forewhile;

import java.util.Scanner;

public class MultDoWhile {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String answer = "";
        do {
            System.out.println("Type a number to generate the multiplication table: ");
            int num = s.nextInt();
            for (int i = 0; i<=10;i++) {
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Do you want to regenerate the multiplication table of some number? ");
            answer = s.next();
        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Thank-you");

    }
}
