package DOMACI;
import java.util.Scanner;
public class Main {

    // Metoda za proveru da li je broj prost
    public static boolean jeProst(int broj) {

        if (broj <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(broj); i++) {
            if (broj % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Metoda koja stampa proste brojeve i racuna sumu
    public static void stampajISaberi(int max) {
        int suma = 0;

        System.out.println("Prosti brojevi su:");

        for (int i = 1; i <= max; i++) {
            if (jeProst(i)) {
                System.out.println(i);
                suma = suma + i;
            }
        }

        System.out.println("Suma prostih brojeva je: " + suma);
    }

     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj do kojeg se traze prosti brojevi: ");
        int broj = sc.nextInt();   // unos celog broja

        stampajISaberi(broj);

        sc.close(); // zatvaranje scanner-a
    }
}
