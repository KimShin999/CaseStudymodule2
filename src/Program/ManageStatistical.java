package Program;

import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Vleague;
import Method.MatchMethod;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManageStatistical {
    public static void veiwMenu(MatchMethod match){

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu Thống kê");
            System.out.println("1. Danh sách cầu thủ mùa giải. ");
            System.out.println("2. Xếp hạng đội bóng. ");
            System.out.println("0. Back");

            String choiceIII = input.nextLine();

            if (choiceIII.equals("1")){
                statisticalPlayers();
            }
            if (choiceIII.equals("2")){
                statisticalTeams(match);
            }
            if (choiceIII.equals("0")){
                break;
            }
        }while (true);
    }

    public static void statisticalPlayers(){
        do {
            System.out.println("1. Xếp theo độ tuổi. ");
            System.out.println("2. Xếp theo chiều cao. ");
            System.out.println("0. Back");

            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            if (choice.equals("1")){
                Collections.sort(Vleague.players, new Comparator<FootballPlayer>() {
                    @Override
                    public int compare(FootballPlayer o1, FootballPlayer o2) {
                        if (o1.getDateOfBirth().isAfter(o2.getDateOfBirth())){
                            return 1;
                        }else {
                            if (o1.getDateOfBirth().isEqual(o2.getDateOfBirth())){
                                return 0;
                            }else {
                                return -1;
                            }
                        }
                    }
                });

                for (FootballPlayer player: Vleague.players){
                    System.out.println(player);
                }

            }
            if (choice.equals("2")){
                Collections.sort(Vleague.players, new Comparator<FootballPlayer>() {
                    @Override
                    public int compare(FootballPlayer o1, FootballPlayer o2) {
                        if (o1.getHeight()<o2.getHeight()){
                            return 1;
                        }else {
                            if (o1.getHeight()==o2.getHeight()){
                                return 0;
                            }else {
                                return -1;
                            }
                        }
                    }
                });
                for (FootballPlayer player: Vleague.players){
                    System.out.println(player);
                }

            }
            if (choice.equals("0")){
                break;
            }
        }while (true);
    }

    public static void statisticalTeams(MatchMethod matchMethod){
        matchMethod.scoreTeam();
        Collections.sort(Vleague.teams, new Comparator<FootballTeam>() {
            @Override
            public int compare(FootballTeam o1, FootballTeam o2) {
                if (o1.getPoint()<o2.getPoint()){
                    return 2;
                }else {
                    if (o1.getPoint()==o2.getPoint() && o1.getGoalDifference() < o2.getGoalDifference()) {
                        return 1;
                    }if (o1.getPoint()==o2.getPoint() && o1.getGoalDifference() == o2.getGoalDifference()){
                        return 0;
                    }else {
                        return -1;
                    }
                }
            }
        });
        for (FootballTeam team: Vleague.teams){
            System.out.println(team);
        }
    }

}
