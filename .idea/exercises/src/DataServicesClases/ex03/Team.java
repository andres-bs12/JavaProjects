package DataServicesClases.ex3;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> roster;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

     public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getRoster() {
        return roster;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }
}
