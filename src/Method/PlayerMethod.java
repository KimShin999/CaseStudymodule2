package Method;

import Entities.FootballPlayer;
import Entities.Vleague;
import Interface.DASU;

public class PlayerMethod extends Vleague implements DASU {
    static int count = 1;

    @Override
    public void getAll() {
        for (FootballPlayer t: players){
            System.out.println(t.toString());
        }
    }

    @Override
    public void update(Object o) {
        FootballPlayer t = (FootballPlayer) o;
        for (FootballPlayer a: players){
            if (t.getNamePlayer().equals(a.getNamePlayer())){
                a.setNamePlayer(t.getNamePlayer());
                a.setDateOfBirth(t.getDateOfBirth());
                a.setHeight(t.getHeight());
                a.setWeight(t.getWeight());
                a.setNumberPlayer(t.getNumberPlayer());
                a.setPosition(t.getPosition());
            }
        }
    }

    @Override
    public void remove(String name) {
        FootballPlayer t = new FootballPlayer();
        for (FootballPlayer a: players){
            if (a.getNameTeam().equals(t)){
                t = a;
            }
        }
        players.remove(t);
    }

    @Override
    public void add(Object o) {
        FootballPlayer t = (FootballPlayer) o;
        players.add(t);
    }

    @Override
    public void search(String name) {
        for (FootballPlayer a: players){
            if (a.getNamePlayer().equals(name)){
                System.out.println(a);
            }
        }
    }
}
