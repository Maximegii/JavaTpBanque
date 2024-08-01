public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Patrick","Merguez");

        System.out.println(personne.toString());
        System.out.println("----------------------------------------");

        CompteCourant compteCourant = new CompteCourant(personne,765547518, 3000, 500);
        System.out.println(compteCourant.toString());

        System.out.println("----------------------------------------");

        CompteEpargne compteEpargne = new CompteEpargne(personne,478542145, 6000, 1.4);
        System.out.println(compteEpargne.toString());

        System.out.println("----------------------------------------");

        compteCourant.retirer(2157);
        System.out.println("----------------------------------------");
        System.out.println(compteCourant.toString());




    }
}