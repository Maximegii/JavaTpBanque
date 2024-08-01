public class Personne {
    private String prenom ;

    public Personne() {

    }
    public Personne(String prenom, String nom){
        this.prenom = prenom ;
        this.nom = nom ;
    }


    public String getPrenom() {
        return this.prenom ;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom ;
    }

    private String nom ;

    public String getNom() {
        return this.nom ;
    }

    public void setNom(String nom) {
        this.nom = nom ;
    }


    public String toString() {
        return "Personne{" +
                "prenom='" +prenom + '\'' +
                ", nom='" +nom + '\'' +
                '}';
    }
}
