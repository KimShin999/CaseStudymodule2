package Entities;

import java.time.LocalDate;

public class Match {
    private LocalDate date;
    private FootballTeam teamA;
    private FootballTeam teamB;
    private int goalTeamA;
    private int goalTeamB;
    private String pitch;
    private String name;


    public void Match(){
    }

    public void Match(LocalDate date, FootballTeam teamA, FootballTeam teamB){
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
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

    @Override
    public String toString() {
        return "Match{" +
                "date='" + date + '\'' +
                ", teamA=" + teamA +
                ", teamB=" + teamB +
                ", pitch='" + pitch + '\'' +
                '}';
    }

}
