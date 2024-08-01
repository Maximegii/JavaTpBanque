public class CompteEpargne extends Compte { ;
    private double interet ;

    public CompteEpargne(Personne proprietaire, int numero, double solde, double interet){
        super (proprietaire, numero, solde, interet);
        this.interet= interet;
    }
    public double getInteret() {
        return this.interet ;
    }
    public void setInteret(double v){
        this.interet = interet;
    }

    public String toString() {
        return "Compte Epargne{" +
                "Solde='" +this.getSolde() + '\'' +
                ", Interet='" +interet + '\'' +
                '}';
    }
}
