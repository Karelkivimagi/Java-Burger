package food.burger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Sisestus {

    private static Scanner scanner = new Scanner(System.in);
    private static Tellimus tellimus = new Tellimus();



    public static void ScannerMenuu() {
        printWelcome();
        boolean quit = false;
        while (!quit) {
            printMainMenu();

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    uusTellimus();
                    break;
                case 0:
                    scanner.close();
                    quit = true;
                    break;

            }
        }
    }



    private static void uusTellimus() {
        printMenu();
        int valik = scanner.nextInt();
        scanner.nextLine();
        printBurgerConfirm(valik);
        switch (valik) {
            case 1:
            case 2:
            case 3:
                String liha = ValiLihaTyyp();
                String kukkel = ValiKukliTyyp(valik);
                LisaMenuu(valik, liha, kukkel);

                tellimus.printKviitung();
                tellimus.getKoguHind();

                break;

            case 4:

                break;

            case 0:
                break;
        }
    }



    private static String ValiLihaTyyp() {
        System.out.println("Valige [1] et edasi minna");
        return scanner.nextLine();
    }


    private static String ValiKukliTyyp(int i) {
        if
            (i != 2) {

            System.out.println("Vali kuklitüüp: ([1]Seemnetega, [2]Seemneteta)");
            return scanner.nextLine();
        }
        return null;
    }



    private static int selectSide(int i) {
        System.out.print("Lisad " + i + ": ");
        return scanner.nextInt();
    }


    private static void LisaMenuu(int i, String liha, String kukkel) {
        tellimus.looOst();
        printSides();
        if (i == 1) {
            tellimus.lisaOstuLisand2(selectSide(i -0));
            tellimus.lisaBurgerOstukirja(1000, liha, kukkel);
            for (int j = 0; j < 4; j++) {
                tellimus.lisaOstuLisand(selectSide(j + 2));
            }
        }
        if (i == 2) {
            tellimus.lisaOstuLisand2(selectSide(i -1));
            tellimus.lisaBurgerOstukirja(1001, liha, kukkel);
            for (int j = 0; j < 4; j++) {
                tellimus.lisaOstuLisand(selectSide(j + 2));
            }
        }
        if (i == 3) {
            tellimus.lisaOstuLisand2(selectSide(i -2));
            tellimus.lisaBurgerOstukirja(1002, liha, kukkel);
            for (int j = 0; j < 4; j++) {
                tellimus.lisaOstuLisand(selectSide(j + 2));
            }
        }
    }


    private static void printWelcome() {

        System.out.println("Tere tulemast!");
        }



    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("Mis on teie soov? ");
        System.out.println("[1] Tee uus tellimus");
        System.out.println("[0] Välju");

    }

    private static void printMenu() {
        System.out.println("[1]  Megaburger [€7]");
        System.out.println("[2]  Retroburger [5€] ");
        System.out.println("[3]  Kanaburger [4€]");
        System.out.println(" ");
        System.out.println("[0] Loobu");
    }

    private static void printBurgerConfirm(int i) {
        if (i == 1) {
            System.out.println("Valitud Megaburger. Soovi korral vali lisad:");
        }
        if (i == 2) {
            System.out.println("Valitud Retroburger. Soovi korral vali lisad:");
        }
        if (i == 3) {
            System.out.println("Valitud: Kanaburger. Soovi korral vali lisad:");
        }
    }

    private static void printSides() {
        System.out.println("Vali lisad: ");
        System.out.println(" ");
        System.out.println("[1]Sisesta lihatüüp ([1]kana - 2€, [2]veise - 3€, [3]sea - 4€]");
        System.out.println("[2]Juust [25s]");
        System.out.println("[3]Kapsas [25s]");
        System.out.println("[4]Tomat [25s]");
        System.out.println("[5]Majonees [50s]");
        System.out.println("[6]Hapukurk [25s]");
        System.out.println("[7]Sibul [25s]");
    }
}