package Ex1;
import java.util.Date;
public class testP {
    public static void main(String[] args) {
        produit pr = new produit();
        produit pr1 = new produit(1021, "lait", "Delice");
        produit pr2 = new produit(2510, "yaourt", "Vitalait");
        produit pr3 = new produit(1021, "tomate", "Sicam", 1.200);
        pr1.affiche();
        pr2.affiche();
        pr3.affiche();
        pr1.setPrix(0.7);
        pr1.affiche();
        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());
        pr1.setDate(new Date(2025,12,12));
        pr1.setDate(new Date(2024,10,30));
        pr1.setDate(new Date(2022,11,25));
        pr1.setDate(new Date(2026,5,1));
    }
}