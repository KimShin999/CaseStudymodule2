package Entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Vleague implements Serializable {

    private int years;

    public static List<FootballTeam> teams = new ArrayList<FootballTeam>();

    public static List<FootballPlayer> players = new ArrayList<FootballPlayer>();

    public static List<Match> matches = new ArrayList<Match>();

    public Vleague(){}

    public Vleague(int years){
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
