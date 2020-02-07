package modele.vehicule;

import modele.Deplacement;
import modele.Observateur;
import modele.Sujet;

import java.util.ArrayList;
import java.util.Collection;

public abstract class MoyenTransport implements Sujet {
    private Collection<Observateur> observateurs;//avec le implements on le fait observable
//Collection n'est pas ordonné
    private String identifiant;

    private int x;
    private int y;


    private double distanceMin;
    private double distanceMax;



    public double getDistanceMin() {
        return distanceMin;
    }

    public double getDistanceMax() {
        return distanceMax;
    }

    public MoyenTransport(String identifiant, int x, int y, double distanceMin, double distanceMax) {
        this.identifiant = identifiant;
        this.x = x;
        this.y = y;
        this.distanceMin = distanceMin;
        this.distanceMax = distanceMax;
        this.observateurs = new ArrayList<>();
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void deplacer(int x, int y){
        Deplacement deplacement = Deplacement.creer(this.x, this.y, x ,y);
        double distance = deplacement.distance();
        if(distance <=this.distanceMax && distance>= this.distanceMin){
            this.x = x;
            this.y = y;
            this.notifierAll(deplacement);
        }
    }

    @Override
    public void enregistrer(Observateur observateur){
        this.observateurs.add(observateur);
    }

    @Override
    public void notifierAll(Deplacement deplacement){
        this.observateurs.stream().forEach(e -> e.notifier(identifiant, deplacement));

    }




}
