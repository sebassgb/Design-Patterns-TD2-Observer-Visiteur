package modele.FormuleComplexe;

public abstract class OperateurBinaire implements Logique {
    private Logique g;
    private Logique d;

    public OperateurBinaire(Logique g, Logique d){
        this.g = g;
        this.d = d;
    }

    public Logique getG(){
        return g;
    }

    public Logique getD(){
        return d;
    }
}
