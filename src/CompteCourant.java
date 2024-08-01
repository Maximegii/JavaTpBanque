public class CompteCourant extends Compte {
    private double decouvert ;

    public CompteCourant(Personne proprietaire, int numero, double solde, double decouvert){
        super (proprietaire, numero, solde, decouvert);
        this.decouvert = decouvert;
    }
    public double getDecouvert() {
        return this.decouvert ;
    }
    public void setDecouvert(double decouvert){
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) {
        if (montant <= 0 ){
            System.out.println("Merci de saisir un montant supérieur à zero !");
            System.exit(0);
        }

        double nouveauSolde = this.getSolde() - montant ;
        if (nouveauSolde >= -decouvert) {
            this.setSolde(nouveauSolde);
            System.out.println("vous avez effectuez un retrait de"+montant);
            System.out.println("");
            System.out.println("votre solde est de :" +this.getSolde());
        }
        else {
            System.out.println("Retrait refusé, solde insufisant !");
        }

    }
    public String toString() {
        return "Compte courant{" +
                "Solde='" +this.getSolde() + '\'' +
                ", Decouvert autorisé='" +decouvert + '\'' +
                '}';
    }
}
