package DataServicesClases.ex1;

public class SerieServices {

    public void analizeSerie(Serie serie) {
        System.out.println("Analyzing " + serie);

        if (serie.getRating() > 3.5) {
            System.out.println("You can't miss this one");
        } else {
            System.out.println("It's not the best...");
        }
    }
}
