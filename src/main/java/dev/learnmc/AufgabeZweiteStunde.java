package dev.learnmc;

import java.util.Scanner;

public class AufgabeZweiteStunde {

    /*
    Schreibe eine if-abfrage und gebe zwei werte addiert oder subtrahiert in die Konsole zurück | Scanner nutzen
    Tipps:
    System.out.println(objekt);
    */
    public static void main(String[] args) {
        /*
        Musterlösung 28.07.2022
        es gehen auch andere. wird am Samstag besprochen!
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();
        scanner.close();
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else {
            System.out.println("Error");
        }
    }

}
