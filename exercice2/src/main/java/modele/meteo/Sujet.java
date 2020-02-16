package modele.meteo;

public interface Sujet {
    public void enregistrerObservateur(Observateur o);
    public void supprimerObservateur(Observateur o);
    public void notifierObservateur(DonneesMeteo deplacement);

    void enregistrer(Observateur observateur);

    void notifierAll(DonneesMeteo deplacement);
}
