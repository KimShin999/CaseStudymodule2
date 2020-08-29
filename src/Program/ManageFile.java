package Program;

import Entities.Vleague;
import Memory.Filez;

public class ManageFile {
    public static final Filez filezTeam = new Filez("Team.dat");
    public static final Filez  filezPlayer = new Filez("Players.dat");
    public static final Filez filezMatch = new Filez("Match.data");

    public static void writeManageFile(){
        Filez.writeObjectToFile(Vleague.teams,filezTeam);
        Filez.writeObjectToFile(Vleague.matches,filezMatch);
        Filez.writeObjectToFile(Vleague.players,filezPlayer);
    }

    public static void readManageFile(){
        Filez.readFromFile(filezTeam);
        Filez.readFromFile(filezPlayer);
        Filez.readFromFile(filezMatch);
    }

}
