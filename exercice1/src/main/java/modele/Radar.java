package modele;

import java.util.*;

public class Radar implements Observateur {

    private Map<String, List<Deplacement>> historique;

    private Radar(){
        historique = new HashMap<>();
    }

    public static Radar creer(){
        return new Radar();
    }

    public List<Deplacement> getDeplacements(String idVehicule){
        List<Deplacement> deplacements = this.historique.get(idVehicule);
        return Objects.isNull(deplacements)? new ArrayList<>():deplacements;
    }

    private void insererNouveauDeplacements(String idVehicule, Deplacement d){//c'est vide ou pas
        List<Deplacement> deplacements = this.historique.get(idVehicule);
        if(Objects.isNull(deplacements)){
            deplacements = new ArrayList<>();
            this.historique.put(idVehicule, deplacements);
        }
        deplacements.add(d);
    }

    @Override
    public void notifier(String idVehicule, Deplacement d){
        this.insererNouveauDeplacements(idVehicule,d);
    }

}
