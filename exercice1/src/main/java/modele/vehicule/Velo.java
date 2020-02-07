package modele.vehicule;

import modele.Deplacement;
import modele.Observateur;
import modele.vehicule.MoyenTransport;

public class Velo extends MoyenTransport {

    private final static String type="Velo";//constant
    private static int ID=0;
    private final static double DISTANCE_MIN = 1.0;//constant
    private final static double DISTANCE_MAX = 4.0;//constant

    public Velo(int x, int y){
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