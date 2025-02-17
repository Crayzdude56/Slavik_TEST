import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* UKOL A
        String[] slova = new String[4];
        System.out.println("Zadej 4 slova");
        for (int i = 0; i < 4; i++) {
            slova[i] = scanner.nextLine();

        }
        System.out.print(","+slova[i]);

         */


        /*UKOL B
        System.out.println("Zadej velikost pole znaku");
        int n = scanner.nextInt();
        char [] znaky = new char[n];

        System.out.println("Zadej "+n+" znaku" );
        for (int i = 0; i < n; i++) {
            System.out.print("Znak"+ (i+1) +": ");
            String kolkate = scanner.next();

        }

        System.out.println("Vypsane znaky");
        for (char znak:znaky) {
            System.out.print(znak + "");
        }

        System.out.println();
        System.out.println("Zadej kolikate pismenko chces ukazat");
        int kolikate = scanner.nextInt();
        if (kolikate > 0 && kolikate < n){
            System.out.println("Zadane pismenko je "+znaky[kolikate-1]);
        }
        else {
            System.out.println("Mimo cislo mimo dosah");
           }
         */


        Hodnoceni[] hodnoceniPole = new Hodnoceni[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Zadej nazev predmetu");
            String predmet = scanner.nextLine();
            System.out.println("Zadej znamku ");
            int znamka = scanner.nextInt();
            scanner.nextLine();

        }







    }





}

