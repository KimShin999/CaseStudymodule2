package Method;

import Entities.Match;
import Entities.Vleague;
import Interface.DASU;

import java.time.LocalDate;
import java.util.*;


public class MatchMethod extends Vleague implements DASU {

    public void randomShedule(){
        List<LocalDate> matchDay = new ArrayList<>();
        LocalDate start = LocalDate.of(2020,9,05);
        for (int i = 0; i < teams.size(); i++){
            matchDay.add(start);
            start = start.plusDays(3);
        }
        for (int i = 0; i < teams.size(); i++){
            int count = i *2;
            if (count >= matchDay.size()) {
                count = count - matchDay.size();
            }
            for (int j = i + 1; j < teams.size() ; j++) {
                Match match = new Match();
                match.setTeamA(teams.get(i));
                match.setTeamB(teams.get(j));

                String name = teams.get(i).getSign() + " vs " + teams.get(j).getSign();
                match.setName(name);

                match.setGoalTeamA((int) (Math.random()*6));
                match.setGoalTeamB((int) (Math.random()*6));
                match.setPitch("Mỹ Tho");
                match.setDate(matchDay.get(count));
                matches.add(match);
                count++;
                if (count > matchDay.size()) count = 0;
            }

        }

        Collections.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                if (o1.getDate().isAfter(o2.getDate())){
                    return 1;
                }else {
                    if (o1.getDate().isEqual(o2.getDate())){
                        return 0;
                    }else {
                        return -1;
                    }
                }
            }
        });

        for (Match a : matches) {
            a.setId(matches.indexOf(a)+1);
        }



//        for (int i = 0; i <matches.size()- 1 ; i++) {
//            for (int j = matches.size()-1; j > i  ; j--) {
//                if (matches.get(i).getDate().isAfter(matches.get(j).getDate())){
//                    Match swap = matches.get(j);
//                    matches.get(j) = matches.get(j-1);
//                    matches.get(j-1) = swap;
//                }
//            }
//        }

//        List<LocalDate> matchDay = new ArrayList<>();
//        LocalDate start =  LocalDate.of(2020,9,05);
//        if (teams.size() % 2 == 0){
//            for (int i = 0; i <teams.size() - 1; i ++){
//                matchDay.add(start);
//                start = start.plusDays(3);
//            }
//        }else {
//            for (int i = 0; i <teams.size(); i ++){
//                matchDay.add(start);
//                start = start.plusDays(3);
//            }
//        }
//
//        if (teams.size() % 2 == 0){
//            for (int i = 0; i < vleague.teams.size() ; i++) {
//                int count = i*2;
//                if (count > matchDay.size()) count = count - matchDay.size();
//                for (int j = i + 1; j < vleague.teams.size() ; j++) {
//                    Match match = new Match();
//                    match.setTeamA(vleague.teams.get(i));
//                    match.setTeamB(vleague.teams.get(j));
//                    match.setGoalTeamA((int) (Math.random()*6));
//                    match.setGoalTeamB((int) (Math.random()*6));
//                    match.setPitch("Mỹ Tho");
//                    match.setDate(matchDay.get(count));
//                    count++;
//                    if (count > matchDay.size()) count = 0;
//                }
//            }
//        }else {
//            for (int i = 0; i < vleague.teams.size() ; i++) {
//                int count = i*2;
//                boolean check = false;
//                if (count > matchDay.size()) count = count - matchDay.size();
//                for (int j = i + 1; j < vleague.teams.size() ; j++) {
//                    Match match = new Match();
//                    match.setTeamA(vleague.teams.get(i));
//                    match.setTeamB(vleague.teams.get(j));
//                    match.setGoalTeamA((int) (Math.random()*6));
//                    match.setGoalTeamB((int) (Math.random()*6));
//                    match.setPitch("Mỹ Tho");
//
//                    for (Match m : vleague.matches){
//                        if (m.getTeamA().equals(match.getTeamA())||
//                                m.getTeamA().equals(match.getTeamB())||
//                                m.getTeamB().equals(match.getTeamA())||
//                                m.getTeamB().equals(match.getTeamB())){
//                            check = true;
//                        }
//                    }
//                    if (check){
//                        count++;
//                    }
//
//
//                    match.setDate(matchDay.get(count));
//                    count++;
//
//                    if (count > matchDay.size()) count = 0;
//                }
//            }
//        }

    }


    @Override
    public void getAll() {
        for (Match m: matches){
            System.out.println(m.toString());
        }
    }

    @Override
    public void update(Object o) {
        Match m = (Match) o;
        for (Match mi: matches){

            if (mi.getName().equals(m.getName())){
                mi.setDate(m.getDate());
            }
        }
    }

    @Override
    public void remove(String name) {
        for (Match m : matches){
            if (m.getName().equals(name) ){
                matches.remove(m);
            }
        }
    }

    @Override
    public void add(Object o) {
        Match m = (Match) o;
        matches.add(m);
    }

    @Override
    public void search(String name) {
        for (Match m : matches){
            if (m.getName().equals(name)){
                System.out.println(m);
            }
        }
    }

    public void updateResult(Object o, int a, int b){
        Match m =(Match) o;
        for (Match mi: matches){
            if (m.getName().equals(mi.getName())){
                mi.setGoalTeamA(a);
                mi.setGoalTeamB(b);
            }
        }
    }
}
