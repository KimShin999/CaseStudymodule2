package Entities;
import java.io.Serializable;
import java.time.LocalDate;

public class Match implements Serializable {
    private int id;
    private LocalDate date;
    private FootballTeam teamA;
    private FootballTeam teamB;
    private int goalTeamA;
    private int goalTeamB;
    private String pitch;
    private String name;


    public Match(){
    }

    public Match(LocalDate date, FootballTeam teamA, FootballTeam teamB){
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        String name = teamA.getSign() + " vs " + teamB.getSign();
    }

    public Match(LocalDate date){

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public FootballTeam getTeamA() {
        return teamA;
    }

    public void setTeamA(FootballTeam teamA) {
        this.teamA = teamA;
    }

    public FootballTeam getTeamB() {
        return teamB;
    }

    public void setTeamB(FootballTeam teamB) {
        this.teamB = teamB;
    }

    public int getGoalTeamA() {
        return goalTeamA;
    }

    public void setGoalTeamA(int goalTeamA) {
        this.goalTeamA = goalTeamA;
    }

    public int getGoalTeamB() {
        return goalTeamB;
    }

    public void setGoalTeamB(int goalTeamB) {
        this.goalTeamB = goalTeamB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", date=" + date +
                ", name=" + name +
                ", goalTeamA=" + goalTeamA +
                ", goalTeamB=" + goalTeamB + "\n"+
                '}';
    }
}
