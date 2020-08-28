package Entities;

import java.util.ArrayList;
import java.util.List;

public class Vleague {

    private int years;

    public List<FootballTeam> teams = new ArrayList<FootballTeam>();

    public List<FootballPlayer> players = new ArrayList<FootballPlayer>();

    public List<Match> matches = new ArrayList<Match>();

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
