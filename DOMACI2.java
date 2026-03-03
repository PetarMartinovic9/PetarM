package DOMACI2;

import java.util.Scanner;

public class DOMACI2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi veličinu niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        unosNiza(niz, sc);

        int max = nadjiMax(niz);
        int ponavljanja = brojPonavljanja(niz, max);

        System.out.println("Najveći broj je: " + max);
        System.out.println("Pojavljuje se " + ponavljanja + " puta.");

        sc.close();
    }

    public static void unosNiza(int[] niz, Scanner sc) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Element " + i + ": ");
            niz[i] = sc.nextInt();
        }
    }

    public static int nadjiMax(int[] niz) {
        int max = niz[0];
        for (int broj : niz) {
            if (broj > max) {
                max = broj;
            }
        }
        return max;
    }

    public static int brojPonavljanja(int[] niz, int max) {
        int count = 0;
        for (int broj : niz) {
            if (broj == max) {
                count++;
            }
        }
        return count;
    }

}
