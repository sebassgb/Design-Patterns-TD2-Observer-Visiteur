package modele;

public interface Sujet {
    public void enregistrerObservateur(Observateur o);
    public void supprimerObservateur(Observateur o);
    public void notifierObservateur(Deplacement deplacement);

    void enregistrer(Observateur observateur);

    void notifierAll(Deplacement deplacement);
}
