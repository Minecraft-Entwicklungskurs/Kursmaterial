package dev.learnmc;

import java.util.Scanner;

public class Kurs {

    public static void main(String[] args) {

//      Datentyp deklaration = Wert
        String string = "Programm startet...";
        System.out.println(string);

//      Scanner objekt um die Konsole auszulesen
        Scanner scanner = new Scanner(System.in);

        //Datentypen können auch ohne Wert deklariert werden:
        String operator;
        //später kann man einen Wert zuweisen
        //in unserem fall:
        operator = scanner.next();
        double one = scanner.nextDouble(); //Zeiger vom Scanner beweg sich zum nächsten input
        double two = scanner.nextDouble(); // ||
        double sol = 0; //sol bekommt 0 als wert zugewiesen

        //else if klammern:
        if(operator.equalsIgnoreCase("+")) {
            sol = one + two; // Wert von sol kann auch geändert werden in dem falle one+two
        }else if(operator.equalsIgnoreCase("-")) {
            sol = one - two; // wert von sol = one-two
        }else if(operator.equalsIgnoreCase("*")) {
            sol = one * two; // wert von sol = one*two
        }else if(operator.equalsIgnoreCase("/")) {
            sol = one / two; //...
            // sol kann man auch beim zuweisen eines Wertes wieder benutzen;
            // sol = sol + 1; wert ist dementsprechend der aktuelle Wert von sol + 1
            // zum abkürzen kann man schreiben sol++; diesen erhöht den Wert von sol ebenfalls + 1
        }else {
            // was passiert wenn nichts zutrifft?
            System.out.println("Error...!");
            //gegebenenfalls Programm mit
            System.exit(0);
            //beenden
        }
        // Ergebnis in die Konsole zurückgeben
        System.out.println("Ergebnis: " + sol);
    }

}
