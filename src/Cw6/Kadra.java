package Cw6;

import java.util.Scanner;

public class Kadra extends Osoba
{
    String Wyk;
    String Stano;
    void iniciuj1()
    {

        iniciuj();

        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Podaj Wykrztałcenie: ");
        Wyk = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("Podaj Stanowisko: ");
        Stano = scanner2.nextLine();
    }
    void drukuj1()
    {
        drukuj();
        System.out.printf(" Wyksztalcenie: "+ Wyk + " Stanowisko: "+ Stano);


    }
}