package Program;

import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Match;
import Entities.Vleague;
import Memory.ManageFileMatch;
import Memory.ManageFilePlayer;
import Memory.ManageFileTeam;

import java.util.List;
public class ReadFile {
    public static void readFile(){

            Vleague.players = (List<FootballPlayer>) ManageFilePlayer.readFromFile();


            Vleague.matches = (List<Match>) ManageFileMatch.readFromFile();


            Vleague.teams = (List<FootballTeam>) ManageFileTeam.readFromFile();

    }
}
