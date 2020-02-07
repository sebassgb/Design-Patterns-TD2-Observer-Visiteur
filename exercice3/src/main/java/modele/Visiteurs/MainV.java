package modele.Visiteurs;

public class MainV {

    public static int maMethode(Mystere x) {
        Visiteur monVisiteur = new VisiteurImpl();
        x.accept(monVisiteur);
        return monVisiteur.getResult();
    }

    public static void main(String[] args) {
        Mystere t = new MystereA();
        System.out.println(maMethode(t));

    }
}
