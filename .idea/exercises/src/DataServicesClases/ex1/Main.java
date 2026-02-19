package DataServicesClases.ex1;

public class Main {
    public static void main(String[] args) {

        Serie mySerie = new Serie();

        mySerie.setName("Breaking Bad");
        mySerie.setRating(1.9);

        SerieServices service = new SerieServices();

        service.analizeSerie(mySerie);

    }

}
