package DataServicesClases.ex3;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {
    public List<String> getWirelessPlayers(Team team) {

        List<String> playersWithWireless = new ArrayList<>();

        if (!team.getRoster().isEmpty()) {
            for (Player player : team.getRoster()) {
                if(player.getGear().getWireless()) {
                    playersWithWireless.add(player.getNickName());
                }
            }
        } return playersWithWireless;
    }
}
