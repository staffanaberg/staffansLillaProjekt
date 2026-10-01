package helloWorld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hej Världen!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hur många buggar hittade du idag? ");
        int bugs = scanner.nextInt();

        if (bugs < 0) {
            System.out.println("Negativa buggar? Du har nog hittat en bugg i räknaren!");
        } else if (bugs == 0) {
            System.out.println("Inga buggar? Har du startat programmet?");
        } else if (bugs <= 5) {
            System.out.println("Bra jobbat! Utvecklaren hävdar att alla är features.");
        } else {
            System.out.println("Nu behöver Staffan både kaffe och en extra utvecklare!");
        }
    }
}
