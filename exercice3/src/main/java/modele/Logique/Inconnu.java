package modele.Logique;

public class Inconnu implements Logique {
    //(Singleton) personne ne peut pas créer une autre Faux que en passant par le static
    private static final Inconnu instance = new Inconnu();

    private Inconnu(){

    }

    //Methode Factory
    public static Inconnu creer(){
        return instance;
    }

    public Logique evaluer() {
        return null;
    }
}
