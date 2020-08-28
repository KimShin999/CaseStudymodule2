package Program;

import Entities.Match;
import Method.MatchMethod;

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

            }
            if (choiceII.equals("3")){

            }
            if (choiceII.equals("0")){
                break;
            }
        }while (true);
    }

    public static void updateShedule(MatchMethod matchMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Bạn muốn sủa trận đấu của đội bóng nào: ");
        String name = input.nextLine();
        for (Match a : matchMethod.matches){
            if (a.getTeamA().equals(name) || a.getTeamB().equals(name)){
                System.out.println(a);
                System.out.println("Nhập vào ngày tổ chức trận đấu: ");


            }
        }


    }



}
