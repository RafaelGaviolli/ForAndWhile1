package br.com.rgaviolli.forewhile;

public class ExamplePPT3 {
    public static void main(String args[]) {
        for (int counter=1; counter<=100; counter++){
            if (counter%5!=0) {
                continue;
            }
            System.out.println("Counter: " + counter);
        }
    }
}
