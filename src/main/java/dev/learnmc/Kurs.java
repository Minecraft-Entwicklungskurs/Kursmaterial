package dev.learnmc;

import java.util.Scanner;

public class Kurs {

    public static void main(String[] args) {
        //Datentyp benennung = Deklaration
        //Klasse bennenung = new Klasse();
        String string = "Hello World!";
        System.out.println(string);
        //Alternative
        //System.err.println(string); für Fehler
        //System.out.println("Hello World"); für allgemeine Informationen

        //Zum Scannen von InputStreams Scanner nutzen
        //scanner.next() zum Erhalten vom ersten eingegebenen Wort
        //scanner.nextLine() zum Erhalten vom gesamten input
        Scanner scanner = new Scanner(System.in);
        //scanner. man greift auf die deklarierte Klasse zu; Vorteil von benennung: Man kann mehrere methoden nacheinander nutzen
        //scanner.nextLine() / nextLine() ist eine in der Scanner Klasse erstellte Methode.
        //scanner.nextLine();
        System.out.println(scanner.nextLine() /*methoden kann man auch direkt ausgeben*/);
        //alternative Lösung:
        //String string = scanner.nextLine();
        //System.out.println(string); // ausgabe des Wertes von string

        //int ist ein primitiver Datentyp
        //Datentypen sind beispielsweise Klassen
        //primitive Klassen sind Klassen, die in vorherigen Sprachen schon benutzt wurden
        int integer = 1; //integer weist man ohne "" Zeichen einen Wert zu
        // man kann mehrere Namen geben (benutzung, falls beide denselben Wert haben):
        //int integer, integerTwo = 1;
        int integerTwo = 2;
        // man kann in der Deklarierung berechnen
        int a = integer + integerTwo;
        // oder beim System.out.println:
        System.out.println(integer + integerTwo);
    }

}
