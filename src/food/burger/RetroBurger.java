package food.burger;

import java.util.ArrayList;
import java.util.ArrayList;

public class RetroBurger extends Hamburger {

    private String nimi;
    private String kukkel;
    private double hind;
    private ArrayList<String> lisandid = new ArrayList<String>();

    public RetroBurger
            (int id,
             String nimi,
             double hind,
             String liha,
             String kukkel) {
        super(id, nimi, hind, liha, kukkel);
    }

}