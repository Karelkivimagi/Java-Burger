package food.burger;

import java.util.ArrayList;


public class Tellimus {
    private int orderNumber = 0;
    private int id;
    private String LihaTyyp;
    private String KukliTyyp;

    private ArrayList<Menuu> ostuKiri;

    public Tellimus() {
        this.ostuKiri = new ArrayList<Menuu>();
    }

    public void looOst() {
        orderNumber++;
    }

    public void lisaBurgerOstukirja(int id, String liha, String kukkel) {
        if (id == 1000) {
            ostuKiri.add(Menuu.createHamburger(liha, kukkel));
            LihaTyyp = liha;
            KukliTyyp = kukkel;
        }
        if (id == 1001) {
            ostuKiri.add(Menuu.LooRetroBurger(liha, kukkel));
            LihaTyyp = liha;
            KukliTyyp = "Seemneteta";
        }
        if (id == 1002) {
            ostuKiri.add(Menuu.LooKanaBurger(liha, kukkel));
            LihaTyyp = liha;
            KukliTyyp = kukkel;
        }

    }

    public void lisaOstuLisand(int id) {
        ostuKiri.add(Menuu.looLisand(id));

    }
    public void lisaOstuLisand2(int idd) {
        ostuKiri.add(Menuu.looLihaValik(idd));

    }

    public void getKoguHind() {
        double[] hindList = new double[ostuKiri.size()];
        for (int i = 0; i < ostuKiri.size(); i++) {
            hindList[i] = ostuKiri.get(i).getHind();
        }
        Arvuta.ArvutaKoguHind(hindList);
        ostuKiri.clear();
    }

    public void printKviitung(){
        Valjastus.printKviitung();
        Valjastus.printLihaJaKuklityyp(LihaTyyp,KukliTyyp);
        passToOutput(ostuKiri);
    }

    private void passToOutput(ArrayList<Menuu> ostuKiri) {
        for (int i = 0; i < ostuKiri.size(); i++) {
            passItem(i, ostuKiri.get(i));
        }
    }

    private void passItem(int i, Menuu item) {
        Valjastus.printItems(i, item);
    }
}