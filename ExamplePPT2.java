package br.com.rgaviolli.forewhile;

public class ExamplePPT2 {

    public static void main(String args[]) {
        for (int counter=1; counter<=1000; counter++){
            System.out.println("This is the repeat number: " + counter);
            if (counter==100)
                break;
        }
    }
}
