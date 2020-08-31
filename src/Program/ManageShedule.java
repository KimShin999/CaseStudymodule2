package Program;

import Entities.Match;
import Entities.Vleague;
import Method.MatchMethod;
import java.time.LocalDate;
import java.util.Scanner;

public class ManageShedule {
    public static void veiwMenu(MatchMethod matchMethod){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Xem lịch thi đấu. ");
            System.out.println("2. Cập nhật lịch thi đấu. ");
            System.out.println("3. Tạo lịch thi đấu. ");
            System.out.println("0. Trở về menu chính. ");

            String choiceII = input.nextLine();

            if (choiceII.equals("1")){
                matchMethod.getAll();
            }
            if (choiceII.equals("2")){
                ManageShedule.updateShedule(matchMethod);
            }
            if (choiceII.equals("3")){
                matchMethod.randomShedule();
            }
            if (choiceII.equals("0")){
                break;
            }
        }while (true);
    }

    public static void updateShedule(MatchMethod matchMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào name trận đấu bạn muốn sửa: ");
        String nameTeams = input.nextLine();
        for (Match a : matchMethod.matches){
            if (a.getTeamA().getNameTeam().equals(nameTeams) || a.getTeamB().getNameTeam().equals(nameTeams)){
                System.out.println(a);
            }
        }
        System.out.println("Nhập vào tên trận đấu mà bạn muốn sửa: ");
        String name = input.nextLine();
        matchMethod.search(name);
        int[] list = new int[3];
        System.out.println("Nhập vào ngày (DD MM YYYY): ");
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        LocalDate date = LocalDate.of(list[2], list[1], list[0]);

        Match match = new Match();
        match.setDate(date);
//        match.setName(name);
        matchMethod.update(match);
    }
}
