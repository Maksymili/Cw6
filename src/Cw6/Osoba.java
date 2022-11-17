package Cw6;

import java.util.Scanner;



    public class Osoba
    {
        String Imie, Nazwisko, Ulica, Kod, Miasto;


        void iniciuj()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Podaj Imie: ");
            Imie = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("Podaj Nazwisko: ");
            Nazwisko = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.printf("Podaj Ulice: ");
            Ulica = scanner2.nextLine();

            Scanner scanner3 = new Scanner(System.in);
            System.out.printf("Podaj Kod: ");
            Kod = scanner3.nextLine();

            Scanner scanner4 = new Scanner(System.in);
            System.out.printf("Podaj Miasto: ");
            Miasto = scanner4.nextLine();

        }
        void drukuj()
        {
            System.out.printf(" Imie: "+ Imie + ", Nazwisko: "+ Nazwisko + ", Ulica: "+ Ulica + ", Kod: "+ Kod + ", Miasto: "+ Miasto + "\n");

        }

    }

