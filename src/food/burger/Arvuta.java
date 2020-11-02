package food.burger;



public class Arvuta {


    public static double ArvutaKoguHind(double[] hinnaKiri) {
        double koguHind = 0;

        for (int i = 0;
             i < hinnaKiri.length; i++)
        {
            koguHind += hinnaKiri[i];
        }


        System.out.println("\nKokku: " + koguHind + "€");

        return koguHind;
    }
}
