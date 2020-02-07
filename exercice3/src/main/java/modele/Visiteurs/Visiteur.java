package modele.Visiteurs;

public interface Visiteur {

    void visit(MystereA mystereA);
    void visit(MystereB mystereB);

    int getResult();
}
