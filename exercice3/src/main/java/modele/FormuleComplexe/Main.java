package modele.FormuleComplexe;

import modele.Logique.Faux;
import modele.Logique.Inconnu;
import modele.Logique.Logique;
import modele.Logique.Vrai;
import modele.Operateurs.Et;
import modele.Operateurs.Non;

public class Main {
    public static void main(String[] args) {
        Faux f1 = Faux.creer();
        Faux f2 = Faux.creer();

        System.out.println(f1 +" =? " + f2);

        Logique t = Non.creer(Et.creer(Vrai.creer(), Non.creer(Inconnu.creer()))).evaluer();

        if(t == Faux.creer()){
            System.out.println("C'est vrai");
        }

        if (t == Faux.creer()){
            System.out.println("C'est Faux");
        }

        if (t == Inconnu.creer()){
            System.out.println("C'est ??");
        }
    }
}
