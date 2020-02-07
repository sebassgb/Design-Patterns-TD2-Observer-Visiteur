package programme;

import modele.Deplacement;
import modele.Observateur;
import modele.Radar;
import modele.vehicule.Avion;
import modele.vehicule.FabriqueMoyenTransport;
import modele.vehicule.Velo;

public class Main {
    public static void main(String[] args) {
        Radar radar1 = Radar.creer();
        Radar radar2 = Radar.creer();
        Observateur observateur = (String idVehicule, Deplacement d) ->
                System.out.println("Je suis un observateur à court mémoire mais j'ai vu le vehicule "+idVehicule + " deplacemet "+ d);



        FabriqueMoyenTransport fabriqueMoyenTransport = new FabriqueMoyenTransport();

        Velo velo1 = fabriqueMoyenTransport.creerVelo(1,1);
        Velo velo2 = fabriqueMoyenTransport.creerVelo(2,2);

        Avion avion1 = fabriqueMoyenTransport.creerAvion(5,5);

        //Enregistrements des observateurs
        velo1.enregistrer(radar1);
        avion1.enregistrer(radar1);
        velo1.enregistrer(radar2);
        velo2.enregistrer(radar2);

        avion1.enregistrer(observateur);

        velo1.deplacer(2, 3);
        velo2.deplacer(3,3);
        avion1.deplacer(100,6);
        avion1.deplacer(150,8);

    }

}
