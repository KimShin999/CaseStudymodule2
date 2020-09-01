package Program;

import Method.MatchMethod;
import Method.PlayerMethod;
import Method.TeamMethod;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TeamMethod teamMethod2020 = new TeamMethod();
        MatchMethod matchMethod2020 = new MatchMethod();
        PlayerMethod playerMethod2020 = new PlayerMethod();
        ReadFile.readFile();

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Chào mừng đến với V-league 2020");
            System.out.println("1. Quản lý danh sách đội bóng. ");
            System.out.println("2. Quản lý lịch thi đấu. ");
            System.out.println("3. Theo dõi kế quả thi đấu. ");
            System.out.println("4. Thống kê.");
            System.out.println("5. Kết thúc mùa giải.");
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
            if (choice.equals("5")){
                closedVleague.closedV();
                break;
            }
            if (choice.equals("0")){
                 WriteFile.writeFile();
                break;
            }
        }while (true);
    }
}
