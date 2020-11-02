package food.burger;


public class Output {

    public static void printKviitung() {
        System.out.println("\nOstu kviitung:\n");
    }

    public static void printLihaJaKuklityyp(String LihaTyyp, String KukliTyyp){
        System.out.println("Valitud lihatüüp: " + LihaTyyp);
        System.out.println("Valitud kukkel: " + KukliTyyp);
        System.out.println("");

    }

    public static void printItems(int i, Menuu item) {
        String nimi = item.getNimi();
        double hind = item.getHind();
        i += 1;
        System.out.println(i + ": " + nimi + ", Summa: " + hind +"€");
    }
}