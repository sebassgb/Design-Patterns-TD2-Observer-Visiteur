package modele.Visiteurs;

public class MystereA implements Mystere {

    public int methodeA() {
        return 5;
    }

    public void accept(Visiteur v) {
        v.visit(this);

    }
}
