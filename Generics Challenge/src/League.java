import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    ArrayList<T> teams = new ArrayList<>();
    private String name;

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T teamN) {
        if(this.teams.contains(teamN)) {
            System.out.println("Team already in league");
            return false;
        }
        else {
            this.teams.add(teamN);
            return true;
        }
    }

    public int findTeam(T teamName) {
        if(this.teams.contains(teamName)) {
            return this.teams.indexOf(teamName);
        }

        else {
            System.out.println("Team not found..");
            return -1;
        }
    }

    public void printLeague() {
        Collections.sort(teams);
        for(T team : teams) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
