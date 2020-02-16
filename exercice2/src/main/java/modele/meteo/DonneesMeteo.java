package modele.meteo;

public class DonneesMeteo {
    float Temperature;
    float Humidite;
    float Pression;

    private DonneesMeteo(float Temperature, float Humidite, float Pression) {
        this.Temperature = Temperature;
        this.Humidite = Humidite;
        this.Pression = Pression;
    }


    public float  getTemperature(){return Temperature;};
    public float  getHumidite(){return Humidite;};
    public float  getPression(){return Pression;};

    public void actualiserMesures(float Temperature, float Humidite, float Pression){
        this.Temperature = Temperature;
        this.Humidite = Humidite;
        this.Pression = Pression;
    };
}
