package modele.vehicule;

import modele.Deplacement;
import modele.Observateur;
import modele.vehicule.MoyenTransport;

public class Avion extends MoyenTransport {

    private final static String type="Avion";//constant
    private static int ID=0;
    private final static double DISTANCE_MIN = 30.0;//constant
    private final static double DISTANCE_MAX = 650.0;//constant

    public Avion(int x, int y){
        super(type+(ID++), x,y, DISTANCE_MIN, DISTANCE_MAX);
    }

    @Override
    public void enregistrerObservateur(Observateur o) {

    }

    @Override
    public void supprimerObservateur(Observateur o) {

    }

    @Override
    public void notifierObservateur(Deplacement deplacement) {

    }
}
