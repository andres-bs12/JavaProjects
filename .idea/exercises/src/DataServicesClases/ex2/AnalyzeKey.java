package DataServicesClases.ex2;

import java.util.ArrayList;
import java.util.List;

public class AnalyzeKey {

    List<String> blacklist = new ArrayList<>(List.of("admin", "12345", "password"));

    public void checkKey(SecurityKey key) {
        for (String leakedPassword : blacklist) {
            if (key.getKey().length() < 3 || key.getKey().contains(leakedPassword)) {
                System.out.println("Password leaked");
            } else {
                System.out.println("Safe password");
            }
        }
    }

    public int makeScoreKey(SecurityKey key) {
        int baseScore = key.getKey().length();
        int finalScore = 0;
        Boolean hasUpperCase = false;
        Boolean hasLowerCase = false;

        for (int i = 0; i < key.getKey().length(); i++) {
            char actualChar = key.getKey().charAt(i);
            if (Character.isUpperCase(actualChar)) {
                hasUpperCase = true;
            } else {
                if (Character.isLowerCase(actualChar)) {
                    hasLowerCase = true;
                }
            }
        }
        if (hasLowerCase && hasUpperCase) {
            finalScore += baseScore * 3;
        }
        return finalScore;
    }
}

