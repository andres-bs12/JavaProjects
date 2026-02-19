package DataServicesClases.ex2;

public class Main {
    public static void main(String[] args) {

    SecurityKey myKey = new SecurityKey();
    myKey.setKey("ABCD");

    AnalyzeKey audite = new AnalyzeKey();

    audite.checkKey(myKey);
        System.out.println(audite.makeScoreKey(myKey));

    }



}
