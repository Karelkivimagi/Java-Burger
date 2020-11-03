package food.burger;
import java.util.ArrayList;

public class Hamburger extends Menuu {
    private String liha;
    private String kukkel;
    private String nimi;
    private double hind;
    private ArrayList<String> lisandid = new ArrayList<String>();

    public Hamburger(int id, String nimi, double hind, String liha, String kukkel) {
        super(id, nimi, hind);

    }

    public String getLiha() {
        return liha;
    }
    public String getKukkel() {
        return kukkel;
    }
}


