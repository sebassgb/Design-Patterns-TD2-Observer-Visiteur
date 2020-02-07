package modele.Visiteurs;

public interface Visitable {
    void accept(Visiteur v);//ne pas penser à factoriser il faut mmetre l'accept le plus baisse possible
}
