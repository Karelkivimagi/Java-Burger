package food.burger;

public class Menuu {
    private int id;
    private String nimi;
    private double hind;


    public Menuu(int id, String nimi, double hind) {
        this.id = id;
        this.nimi = nimi;
        this.hind = hind;
    }


    public static Menuu createHamburger(String liha, String kukkel) {
        return new Hamburger(1000, "Megaburger", 7.0, liha, kukkel);
    }

    public static Menuu LooRetroBurger(String liha,  String kukkel) {
        return new RetroBurger(1001, "Retroburger", 5.0, liha, kukkel);
    }

    public static Menuu LooKanaBurger(String liha, String kukkel) {
        return new KanaBurger(1002, "Kanaburger", 4.0, liha, kukkel);
    }

    public static Menuu looLihaValik(int idd) {
        if (idd == 1) {
            return new Lisad(idd, "Kana", 2);
        }

        if (idd == 2) {
            return new Lisad(idd, "Veise", 3);

        }
        if (idd == 3) {
            return new Lisad(idd, "Sea", 4);

        }

        return null;
    }


    public static Menuu looLisand(int id) {
        if (id == 1) {
            return new Lisad(id, "Juust", 0.25);
        }

        if (id == 2) {
            return new Lisad(id, "Kapsas", 0.25);

        }
        if (id == 3) {
            return new Lisad(id, "Tomat", 0.25);

        }
        if (id == 4) {
            return new Lisad(id, "Majonees", 0.5);

        }
        if (id == 5) {
            return new Lisad(id, "Hapukurk", 0.25);

        }
        if (id == 6) {
            return new Lisad(id, "Sibul", 0.25);

        }

        return null;
    }

    public int getId() {
        return id;
    }

    public String getNimi() {
        return nimi;
    }

    public double getHind() {
        return hind;
    }
}