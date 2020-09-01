package Entities;
import java.io.Serializable;
public class FootballTeam implements Serializable {
    private String nameTeam;
    private String sign;
    private String coach;
    private String playersAttend;
    private int point;
    private int goalDifference;
    private String id;
    private int numberRandom;

    public FootballTeam(){}

    public FootballTeam(String nameTeam, String sign, String coach){
        this.nameTeam = nameTeam;
        this.sign = sign;
        this.coach = coach;
    }
    public FootballTeam(String nameTeam, String sign, String coach, String id){
        this.nameTeam = nameTeam;
        this.sign = sign;
        this.coach = coach;
        this.id = id;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayersAttend() {
        return playersAttend;
    }

    public void setPlayersAttend(String playersAttend) {
        this.playersAttend = playersAttend;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getNumberRandom() {
        return numberRandom;
    }

    public void setNumberRandom(int numberRandom) {
        this.numberRandom = numberRandom;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {
        return id + "."+
                "Đội ='" + nameTeam + '\'' +
                ", sign='" + sign + '\'' +
                ", coach='" + coach + '\'' +
                ", điểm=" + point +
                ", goalDifference=" + goalDifference +
                '}';
    }

    public String toStringg(FootballTeam F){
        return  "TOP "+(Vleague.teams.indexOf(F)+1) + "."+
                "Đội ='" + nameTeam + '\'' +
                ", sign='" + sign + '\'' +
                ", coach='" + coach + '\'' +
                ", điểm=" + point +
                ", goalDifference=" + goalDifference +
                '}';
    }
}
