package Method;
import Entities.FootballTeam;
import Entities.Vleague;
import Interface.DASU;

public class TeamMethod extends Vleague implements DASU {
    static int count = 1;
    @Override
    public void getAll() {
        for (FootballTeam t: teams){
            System.out.println(t.toString());
        }
    }

    @Override
    public void update(Object o) {
        FootballTeam t = (FootballTeam) o;
        for (FootballTeam a: teams){
            if (a.getId().equals(t.getId())){
                a.setNameTeam(t.getNameTeam());
                a.setSign(t.getSign());
                a.setCoach(t.getCoach());
            }
        }
    }

    @Override
    public void remove(String name) {
        FootballTeam t = new FootballTeam();
        for (FootballTeam a: teams){
            if (a.getNameTeam().equals(name)){
                t = a;
            }
        }
        teams.remove(t);
    }

    @Override
    public void add(Object o) {
        FootballTeam t = (FootballTeam) o;
        teams.add(t);
        String a = ""+count;
        t.setId(a);
        count++;
    }

    @Override
    public void search(String name) {
        for (FootballTeam team: teams){
            if (team.getNameTeam().equals(name)){
                System.out.println(team);
            }
        }
    }
}
