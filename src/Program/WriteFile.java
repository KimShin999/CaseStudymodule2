package Program;
import Entities.Vleague;
import Memory.ManageFileMatch;
import Memory.ManageFilePlayer;
import Memory.ManageFileTeam;

public class WriteFile {
    public static void writeFile(){
        ManageFilePlayer.writeObjectToFile(Vleague.players);
        ManageFileMatch.writeObjectToFile(Vleague.matches);
        ManageFileTeam.writeObjectToFile(Vleague.teams);
    }
}
