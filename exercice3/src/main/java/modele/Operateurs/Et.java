package modele.Operateurs;

import modele.Logique.*;

public class Et extends OperateurBinaire {

    private Et(Logique g, Logique d) {
        super(g, d);
    }

    //Methode Factory
    public static Et creer(Logique g, Logique d){
        return new Et(g,d);
    }

    public Logique evaluer(){
        Logique ge = this.getG().evaluer();
        Logique de = this.getD().evaluer();

        if(ge == Faux.creer() || de == Faux.creer()){
            return Faux.creer();
        }

        if(ge == Vrai.creer()){
            return Faux.creer();
        }

        return Inconnu.creer();
    }
}



