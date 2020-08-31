package Program;
import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Match;
import Entities.Vleague;
import Memory.ManageFileMatch;
import Memory.ManageFilePlayer;
import Memory.ManageFileTeam;
import Method.MatchMethod;
import Method.PlayerMethod;
import Method.TeamMethod;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TeamMethod teamMethod2020 = new TeamMethod();
        MatchMethod matchMethod2020 = new MatchMethod();
        PlayerMethod playerMethod2020 = new PlayerMethod();

        Vleague.players = (List<FootballPlayer>) ManageFilePlayer.readFromFile();
        Vleague.matches = (List<Match>) ManageFileMatch.readFromFile();
        Vleague.teams = (List<FootballTeam>) ManageFileTeam.readFromFile();



        Scanner input = new Scanner(System.in);

//
//        FootballTeam saigon = new FootballTeam("Sài Gòn", "SGN" , "Hoàng Văn Phúc");
//        Vleague.teams.add(saigon);
//        FootballTeam hanoi = new FootballTeam("Hà Nội", "HNI" , "Chu Đình Nghiêm");
//        Vleague.teams.add(hanoi);
//        FootballTeam hoanganhgialai = new FootballTeam("Hoàng Anh Gia Lai", "HAGL" , "Lee Tae Hoon");
//        Vleague.teams.add(hoanganhgialai);
//        FootballTeam codegym = new FootballTeam("CodeGym", "C0620K1" , "Mai Công Sơn");
//        Vleague.teams.add(codegym);
//
//        FootballPlayer lam = new FootballPlayer("Sài Gòn");
//        Vleague.players.add(lam);
//        FootballPlayer van = new FootballPlayer("Hà Nội");
//        Vleague.players.add(van);
//        FootballPlayer viet = new FootballPlayer("Hoàng Anh Gia Lai");
//        Vleague.players.add(viet);
//        FootballPlayer thuong = new FootballPlayer("CodeGym");
//        Vleague.players.add(thuong);

//        System.out.println(Vleague.players);
//        System.out.println(Vleague.matches);
//        System.out.println(Vleague.teams);


        do {
            System.out.println("Chào mừng đến với V-league 2020");
            System.out.println("1. Quản lý danh sách đội bóng. ");
            System.out.println("2. Quản lý lịch thi đấu. ");
            System.out.println("3. Theo dõi kế quả thi đấu. ");
            System.out.println("4. Thống kê.");
            System.out.println("0. Thoát khỏi chương trình. ");


            String choice = input.nextLine();

            if (choice.equals("1")){
                ManageTeamList.veiwMenu(teamMethod2020, playerMethod2020);
            }
            if (choice.equals("2")){
                ManageShedule.veiwMenu(matchMethod2020);
            }
            if (choice.equals("3")){
                teamMethod2020.getAll();
            }
            if (choice.equals("4")){
                ManageStatistical.veiwMenu(matchMethod2020);
            }
            if (choice.equals("0")){
                 ManageFilePlayer.writeObjectToFile(Vleague.players);
                 ManageFileMatch.writeObjectToFile(Vleague.matches);
                 ManageFileTeam.writeObjectToFile(Vleague.teams);
                break;
            }
        }while (true);
    }
}
