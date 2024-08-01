public class Compte {
    private Personne proprietaire ;
    private final int numero ;
    private double solde ;

    private static int compteur = 0;


    public Compte(Personne proprietaire, int numero, double solde, double interet){
        this.proprietaire = proprietaire;
        this.numero = ++compteur;
        this.solde = solde;
    }

    public Personne getProprietaire() {
        return this.proprietaire;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSolde(){
        return this.solde;
    }
    public void setProprietaire(Personne personne){
        this.proprietaire = proprietaire;
    }

    public void setSolde(double solde){
        this.solde = solde;
    }

    void retirer(double montant) {

    }
    void crediter (double montant){

    }

}
