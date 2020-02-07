package modele.Visiteurs;

public class MystereB implements Mystere {


    public int methodeB() {
        return 8;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }
}
