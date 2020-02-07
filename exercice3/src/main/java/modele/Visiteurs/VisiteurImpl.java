package modele.Visiteurs;


public class VisiteurImpl implements Visiteur {
    int resultat;

    public void visit(MystereA mystereA) {
        resultat = mystereA.methodeA();
    }

    public void visit(MystereB mystereB) {
        resultat = mystereB.methodeB();
    }

    public int getResult() {
        return resultat;
    }
}
