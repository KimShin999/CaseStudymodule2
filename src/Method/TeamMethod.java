package Method;
import Entities.FootballTeam;
import Entities.Vleague;
import Interface.DASU;
import java.util.Collections;
import java.util.Comparator;

public class TeamMethod extends Vleague implements DASU {
    static int count;
    @Override
    public void getAll() {

        Collections.sort(Vleague.teams, new Comparator<FootballTeam>() {
            @Override
            public int compare(FootballTeam o1, FootballTeam o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (FootballTeam t: teams){
            System.out.println(t);
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
        count = Vleague.teams.size()+1;
        FootballTeam t = (FootballTeam) o;
        teams.add(t);
        String a = ""+count;
        t.setId(a);
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
