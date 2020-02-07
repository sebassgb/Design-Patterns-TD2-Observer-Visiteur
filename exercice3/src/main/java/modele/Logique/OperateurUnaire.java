package modele.Logique;

public abstract class OperateurUnaire implements Logique {
    private Logique t;

    public OperateurUnaire(Logique t){
        this.t = t;
    }


    public Logique getT(){
    return t;
    }



}
