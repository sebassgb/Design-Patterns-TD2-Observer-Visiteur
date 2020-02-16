package modele;

public class Deplacement {//jouer le role de fabriquer method fabrique pour fabriquer un instace
    int yDepart;
    int xArrive;
    int yArrive;
    int xDepart;

    private Deplacement(int yDepart, int xArrive, int yArrive, int xDepart) {
        this.yDepart = yDepart;
        this.xArrive = xArrive;
        this.yArrive = yArrive;
        this.xDepart = xDepart;
    }

    public static Deplacement creer(int xDepart, int yDepart, int xArrive, int  yArrive){//le methode permet créer l'objet
        return new Deplacement(xDepart, yDepart, xArrive, yArrive);
    }

    public int getyDepart() {
        return yDepart;
    }

    public int getxArrive() {
        return xArrive;
    }

    public int getyArrive() {
        return yArrive;
    }

    public int getxDepart() {
        return xDepart;
    }

    public double distance(){
        return Math.sqrt(Math.pow(xArrive-yDepart, 2)+ Math.pow(yArrive-yDepart,2));
        }

}
