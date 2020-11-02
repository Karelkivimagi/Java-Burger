package food.burger;




public class Hamburger extends Menuu {
    private String liha;
    private String kukkel;


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


