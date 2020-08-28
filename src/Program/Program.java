package Program;

import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Match;
import Method.TeamMethod;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TeamMethod vleague2020 = new TeamMethod();
        Scanner input = new Scanner(System.in);

//        FootballTeam HNI = new FootballTeam("Hà Nội", "HNI","Minh Mèo");
//        FootballTeam SGN = new FootballTeam("Sài Gòn", "SGN", "Thiệu Style");
//
//        vleague2020.teams.add(HNI);
//        vleague2020.teams.add(SGN);
//
//        for (FootballTeam a: vleague2020.teams){
//            System.out.println(a);
//        }
//
//        FootballPlayer VietJohan = new FootballPlayer("vietJohan", "25/05/1996", 1.73,70,25,"CK");
//        FootballPlayer VanPersi = new FootballPlayer("Văn PerSi", "25/05/1996", 1.73,70,25,"CK");
//
//
//        for (FootballPlayer a: HNI.players){
//            System.out.println(a);
//        }
//
//        System.out.println(vleague2020.getYears());

//        VleagueMethod vleague2020 = new VleagueMethod();




        do {
            System.out.println("Chào mừng đến với V-league 2020");
            System.out.println("1. Quản lý danh sách đội bóng. ");
            System.out.println("2. Quản lý lịch thi đấu. ");
            System.out.println("3. Quản lý kế quả thi đấu. ");
            System.out.println("4. Thống kê.");
            System.out.println("0. Thoát khỏi chương trình. ");


            String choice = input.nextLine();

            if (choice.equals("1")){
                ManageTeamList.veiwMenu(vleague2020);
            }
            if (choice.equals("2")){

            }
            if (choice.equals("3")){

            }
            if (choice.equals("4")){

            }
            if (choice.equals("0")){
                break;
            }
        }while (true);

    }
}
