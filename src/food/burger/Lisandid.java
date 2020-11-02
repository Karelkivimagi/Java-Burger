package food.burger;
import java.util.ArrayList;

public class Lisandid {
    private ArrayList<String> lisandid = new ArrayList<String>();
    private double hind;

    public Lisandid(ArrayList<String> lisandid) {
        for (int i = 0; i < lisandid.size(); i++) {
            this.hind += 0.25;
            this.lisandid.add(lisandid.get(i));
        }
    }


    public Lisandid() {
        this.hind = 0;
    }

    public int getLisandAmount() {
        return lisandid.size();
    }

    public ArrayList<String> getLisandid() {
        return lisandid;
    }

    public double getPrice() {
        return hind;
    }
}