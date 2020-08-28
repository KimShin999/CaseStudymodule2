package Entities;

public class FootballPlayer extends FootballTeam {
    static int conut;
    private String namePlayer;
    private String dateOfBirth;
    private double height;
    private double weight;
    private int numberPlayer;
    private String position;
    private int goal;
    private String team;
    private int card;

    public FootballPlayer(){}

    public FootballPlayer(String namePlayer, String dateOfBirth, double height, double weight, int numberPlayer, String position, String Team){
        conut++;
        this.namePlayer = namePlayer;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.numberPlayer = numberPlayer;
        this.position = position;
        this.team = Team;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "namePlayer='" + namePlayer + '\'' +
                ", numberPlayer=" + numberPlayer +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
