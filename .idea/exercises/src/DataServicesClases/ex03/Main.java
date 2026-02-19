package DataServicesClases.ex3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        PlayerService servicio = new PlayerService();

        // Creating players
        Player elBeja = new Player();
        Player pacho = new Player();

        // Setting players
        elBeja.setRole("Shooter");
        elBeja.setNickName("El Beja");
        pacho.setRole("Defender");
        pacho.setNickName("Pacho El Celacho");

        // Creating and setting gears
        Gear bejager = new Gear("Logitech", "RAZER", true);
        Gear pachoGear = new Gear("HP", "HP", false);
        pacho.setGear(pachoGear);
        elBeja.setGear(bejager);

        // Creating List
        List<Player> list = new ArrayList<>(List.of(elBeja, pacho));

        // Setting list
        Team heretics = new Team();
        heretics.setTeamName("Heretics");
        heretics.setRoster(list);

        // Function call
//        List<String> wirelessOnes = PlayerService.getWirelessPlayers(heretics);
//        System.out.println(wirelessOnes);

        PlayerService service = new PlayerService();
        List<String> result = service.getWirelessPlayers(heretics);

        System.out.println(result);
    }

}
