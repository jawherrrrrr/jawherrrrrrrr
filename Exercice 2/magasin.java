public class magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMagasin;
    private produit_ex2[] ensembleProduits;
    private static int nbrProduit = 0;

    public Magasin(int identifiant, String adresse, int capaciteMagasin) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMagasin = capaciteMagasin;
        this.ensembleProduits = new produit_ex2[50];
    }

    public void ajouterProduit(produit_ex2 nouveauProduit) {
        if (nbrProduit < 50) {
            ensembleProduits[nbrProduit] = nouveauProduit;
            nbrProduit++;
        } else {
            System.out.println("Impossible d'ajouter un autre produit, le magasin est plein !");
        }
    }

    public void afficherCaracteristiqueMagasin() {
        System.out.println("Le magasin a un identifiant : " + identifiant + ", son adresse est : " + adresse +
                ", sa capacité est : " + capaciteMagasin + " et ses produits sont : ");
        for (produit_ex2 produit : ensembleProduits) {
            if (produit != null) {
                System.out.println("Ce produit : " + produit.getNom() + ", a un prix : " + produit.getPrix());
            }
        }
    }

    public static int nbrProduit() {
        return nbrProduit;
    }
}