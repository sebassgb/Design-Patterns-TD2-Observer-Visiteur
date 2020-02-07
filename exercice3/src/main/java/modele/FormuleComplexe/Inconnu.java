package modele.FormuleComplexe;

public class Inconnu implements Logique {

    private Inconnu(){

    }

    //Methode Factory
    public static Inconnu creer(){
        return new Inconnu();
    }

}
