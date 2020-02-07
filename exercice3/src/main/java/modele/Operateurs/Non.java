package modele.Operateurs;

import modele.Logique.*;

public class Non extends OperateurUnaire {

    private Non(Logique t) {
        super(t);
    }

    //Methode Factory
    public static Non creer(Logique t){
        return new Non(t);
    }

    public Logique evaluer() {
        Logique te = this.getT().evaluer();
        if(te == Vrai.creer()){
            return Faux.creer();
        };

        if(te == Faux.creer()){
            return Vrai.creer();
        }

        return Inconnu.creer();
    }
}
