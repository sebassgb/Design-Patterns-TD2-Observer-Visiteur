package modele.Logique;

public class Faux implements Logique {
    //(Singleton) personne ne peut pas créer une autre Faux que en passant par le static
    private static final Faux instance = new Faux();




    //Methode Factory
    public static Faux creer(){
        return instance;
    }

    public Logique evaluer() {
        return null;
    }
}
