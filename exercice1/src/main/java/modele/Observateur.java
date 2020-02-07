package modele;

public interface Observateur {

    void notifier(String idVehicule, Deplacement d);
}
