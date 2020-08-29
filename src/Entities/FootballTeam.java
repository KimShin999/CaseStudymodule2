package Entities;


import java.util.ArrayList;
import java.util.List;

public class FootballTeam extends Vleague {
    private String nameTeam;
    private String sign;
    private String coach;
    private String playersAttend;
    private int point;
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

    public List<FootballPlayer> players = new ArrayList<>();

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

    @Override
    public String toString() {
        return  id +"."+
                "Đội bóng: " + nameTeam +
                ", Sign: " + sign +
                ", HLV: " + coach  +
                ", SL dự:" + playersAttend +
                ", Điểm: " + point;
    }
}
