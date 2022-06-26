package br.com.rgaviolli.forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExamplePPT1 {

    public static void main(String args[]) {
        List<Integer> valor = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            System.out.println("Line " + i);
            valor.add(i);
        }

        for (Integer i : valor) {
            System.out.println("Line " + i);
        }

        valor.forEach(i-> System.out.println("Line " + i));

    }
}
