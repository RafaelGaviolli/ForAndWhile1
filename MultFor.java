package br.com.rgaviolli.forewhile;

import java.util.Scanner;

public class MultFor {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert a number to generate a multiplication table: ");
        int num = s.nextInt();
        for (int i = 0; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
