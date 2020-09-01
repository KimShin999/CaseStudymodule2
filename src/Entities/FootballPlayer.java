package Entities;
import java.io.Serializable;
import java.time.LocalDate;
public class FootballPlayer implements Serializable {
    static int conut;
    private  int id;
    private String namePlayer;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;
    private String numberPlayer;
    private String position;
    private int goal;
    private String nameTeam;
    private int card;

    public FootballPlayer(){
        this.nameTeam = "tự do";
    }

    public FootballPlayer(String nameTeam){
        this.nameTeam = nameTeam;
    }

    public FootballPlayer(String namePlayer ,String nameTeam){
        this.nameTeam = nameTeam;
        this.namePlayer = namePlayer;
        this.nameTeam = "tự do";
    }

    public FootballPlayer(String namePlayer, LocalDate dateOfBirth, double height, double weight, String numberPlayer, String position, String Team){
        conut++;
        this.id = conut;
        this.namePlayer = namePlayer;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.numberPlayer = numberPlayer;
        this.position = position;
        this.nameTeam = Team;
    }

    public FootballPlayer(String namePlayer, LocalDate dateOfBirth,  String numberPlayer, String position, String Team){
        conut++;
        this.id = conut;
        this.namePlayer = namePlayer;
        this.dateOfBirth = dateOfBirth;
        this.numberPlayer = numberPlayer;
        this.position = position;
        this.nameTeam = Team;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(String numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "namePlayer='" + namePlayer + '\'' +
                ", numberPlayer=" + numberPlayer +
                ", dateOfbirth='" + dateOfBirth + '\'' +
                ", team='" + nameTeam + '\'' + "\n"+
                '}';
    }
}
