package Program;

import Entities.FootballTeam;
import Method.TeamMethod;

import java.util.Scanner;

public class ManageTeamList {
    public static void veiwMenu(TeamMethod teamMethod){

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Xem danh sách đội bóng. ");
            System.out.println("2. Cập nhật thông tin đội bóng. ");
            System.out.println("3. Thêm mới một đội bóng. ");
            System.out.println("0. Trở về menu chính. ");

            String choiceI = input.nextLine();

            if (choiceI.equals("1")){
                teamMethod.getAll();
            }
            if (choiceI.equals("2")){
                updateTeam(teamMethod);
            }
            if (choiceI.equals("3")){
                addTeam(teamMethod);
            }
            if (choiceI.equals("0")){
                break;
            }

        }while (true);
    }

    public static void updateTeam(TeamMethod teamMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào sign đội bạn muốn sửa: ");
        String name = input.nextLine();
        teamMethod.search(name);

        System.out.println("Sửa tên đội: ");
        name = input.nextLine();
        System.out.println("Sửa Sign: ");
        String sign = input.nextLine();
        System.out.println("Sửa tên HLV: ");
        String coach = input.nextLine();

        FootballTeam teamA = new FootballTeam(name, sign, coach);

        teamMethod.update(teamA);
    }

    public static void addTeam(TeamMethod teamMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên đội: ");
        String name = input.nextLine();
        System.out.println("nhập vào kí hiệu tên: ");
        String sign = input.nextLine();
        System.out.println("nhập vào tên huấn luyện viên: ");
        String coach = input.nextLine();

        FootballTeam teamA = new FootballTeam(name, sign, coach);

        teamMethod.add(teamA);
    }

}
