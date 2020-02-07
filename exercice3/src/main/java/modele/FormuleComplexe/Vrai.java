package modele.FormuleComplexe;

public class Vrai implements Logique {
    //(Singleton) personne ne peut pas créer une autre Faux que en passant par le static
    private static final Vrai instance = new Vrai();

    private Vrai(){

    }

    //Methode Factory
    public static Vrai creer(){
        return instance;
    }

    public Logique evaluer() {
        return null;
    }
}
