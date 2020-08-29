package Program;



import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Vleague;
import Method.MatchMethod;
import Method.TeamMethod;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ManageFile.readManageFile();
        TeamMethod teamMethod2020 = new TeamMethod();
        MatchMethod matchMethod2020 = new MatchMethod();
        Scanner input = new Scanner(System.in);

        FootballTeam hanoi = new FootballTeam("hanoi", "hni", "lam");
        FootballTeam saigon = new FootballTeam("saigon", "sgn", "lam");
        FootballTeam halong = new FootballTeam("halong", "hlg", "lam");
        FootballTeam vinhphuc = new FootballTeam("vinhphuc", "vpc", "lam");

        FootballPlayer lam = new FootballPlayer("lam","hanoi");
        FootballPlayer van = new FootballPlayer("van","saigon");
        FootballPlayer thuong = new FootballPlayer("thuong", "halong");
        FootballPlayer viet = new FootballPlayer("viet"," vinhphuc");

        Vleague.players.add(viet);
        Vleague.players.add(lam);
        Vleague.players.add(thuong);
        Vleague.players.add(van);

        teamMethod2020.add(hanoi);
        teamMethod2020.add(saigon);
        teamMethod2020.add(halong);
        teamMethod2020.add(vinhphuc);



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
            System.out.println("3. Theo dõi kế quả thi đấu. ");
            System.out.println("4. Thống kê.");
            System.out.println("0. Thoát khỏi chương trình. ");


            String choice = input.nextLine();

            if (choice.equals("1")){
                ManageTeamList.veiwMenu(teamMethod2020);
            }
            if (choice.equals("2")){
                ManageShedule.veiwMenu(matchMethod2020);
            }
            if (choice.equals("3")){
                teamMethod2020.getAll();
            }
            if (choice.equals("4")){

            }
            if (choice.equals("0")){
                ManageFile.writeManageFile();
                break;
            }
        }while (true);

    }
}
