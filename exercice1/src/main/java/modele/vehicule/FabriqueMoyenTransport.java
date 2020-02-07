package modele.vehicule;

public class FabriqueMoyenTransport {

    public Avion creerAvion(int x, int y){
        return new Avion(x,y);
    }

    public Char creerChar(int x, int y){
        return new Char(x,y);
    }

    public Velo creerVelo(int x, int y){
        return new Velo(x,y);
    }

}
