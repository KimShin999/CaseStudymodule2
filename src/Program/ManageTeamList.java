package Program;

import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Vleague;
import Method.TeamMethod;

import java.util.Scanner;

public class ManageTeamList {
    public static void veiwMenu(TeamMethod teamMethod){

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Xem danh sách đội bóng. ");
            System.out.println("2. Cập nhật thông tin đội bóng. ");
            System.out.println("3. Thêm mới một đội bóng. ");
            System.out.println("4. Rút quyền tham dự của đội bóng. ");
            System.out.println("0. Trở về menu chính. ");

            String choiceI = input.nextLine();

            if (choiceI.equals("1")){
                listTeamFootball(teamMethod);
            }
            if (choiceI.equals("2")){
                updateTeam(teamMethod);
            }
            if (choiceI.equals("3")){
                addTeam(teamMethod);
            }
            if (choiceI.equals("4")){
                removeTeam(teamMethod);
            }
            if (choiceI.equals("0")){
                break;
            }

        }while (true);
    }

    public static void listTeamFootball(TeamMethod teamMethod){

        Scanner input = new Scanner(System.in);
        teamMethod.getAll();
        int choice = Integer.parseInt(input.nextLine());
        for (int i = 0; i < Vleague.teams.size()-1 ; i++) {
            if (choice==i){
                System.out.println("Danh sách đội bóng" + Vleague.teams.get(i-1).getNameTeam());
                for (FootballPlayer player : Vleague.players){
                    if (player.getNameTeam().equals(Vleague.teams.get(i-1).getNameTeam())){
                        System.out.println(player);
                    }
                }
            }
        }
        System.out.println("Chọn đội nếu bạn muốn xem danh sách cầu thủ");
    }

    public static void updateTeam(TeamMethod teamMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên đội bạn muốn sửa: ");
        String name = input.nextLine();
        teamMethod.search(name);

        System.out.println("Nhập vào số id của đội bóng: ");
        String id = input.nextLine();
        System.out.println("Sửa tên đội: ");
        name = input.nextLine();
        System.out.println("Sửa Sign: ");
        String sign = input.nextLine();
        System.out.println("Sửa tên HLV: ");
        String coach = input.nextLine();

        FootballTeam teamA = new FootballTeam(name, sign, coach, id);

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

    public static void removeTeam(TeamMethod teamMethod){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên đội bị mất quyền thi đấu: ");
        String name = input.nextLine();

        teamMethod.remove(name);
    }

}
