package Program;
import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Match;
import Entities.Vleague;
import Memory.ManageFileMatch;
import Memory.ManageFilePlayer;
import Memory.ManageFileTeam;

import java.util.ArrayList;

public class closedVleague {
    public static void closedV(){
        Vleague.players = new ArrayList<FootballPlayer>();
        Vleague.teams = new ArrayList<FootballTeam>();
        Vleague.matches = new ArrayList<Match>();
        ManageFilePlayer.writeObjectToFile(Vleague.players);
        ManageFileMatch.writeObjectToFile(Vleague.matches);
        ManageFileTeam.writeObjectToFile(Vleague.teams);
    }
}
