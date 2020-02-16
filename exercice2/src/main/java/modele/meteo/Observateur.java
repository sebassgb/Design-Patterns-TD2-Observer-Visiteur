package modele.meteo;

public interface Observateur {
    void notifier(String idV, DonneesMeteo d);
}
