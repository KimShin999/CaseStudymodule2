package Program;
import Entities.FootballPlayer;
import Entities.FootballTeam;
import Entities.Vleague;
import Method.PlayerMethod;
import Method.TeamMethod;
import java.time.LocalDate;
import java.util.Scanner;

public class ManageTeamList {
    public static void veiwMenu(TeamMethod teamMethod, PlayerMethod playerMethod){

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Xem danh sách đội bóng. ");
            System.out.println("2. Cập nhật thông tin đội bóng. ");
            System.out.println("3. Thêm mới một đội bóng. ");
            System.out.println("4. Rút quyền tham dự của đội bóng. ");
            System.out.println("0. Trở về menu chính. ");

            String choiceI = input.nextLine();

            if (choiceI.equals("1")){
                listTeamFootball(teamMethod, playerMethod);
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

    public static void listTeamFootball(TeamMethod teamMethod, PlayerMethod playerMethod){
        boolean check =true;
        while (check){
            Scanner input = new Scanner(System.in);
            teamMethod.getAll();
            if (Vleague.teams.size()==0){
                System.out.println("chưa có đội bóng nào!");
                break;
            }
            System.out.println("0.Back");
            System.out.println("Nhập vào số để xem thông tin về đội bóng: ");
            int choice = input.nextInt();
            for (int i = 0; i < Vleague.teams.size() ; i++) {
                if (choice == 0){
                   check = false;
                }else if (choice == i+1){
                    System.out.println("1.Danh sách cầu thủ thi đấu");
                    System.out.println("2.Thêm mới cầu thủ");
                    System.out.println("3.Chấm dứt hợp đồng cầu thủ");
                    System.out.println("4.Cập nhật thông tin cầu thủ");
                    System.out.println("0.Back");

                    boolean checkk = true;
                    while (checkk){
                        String choiceI = input.nextLine();
                        if (choiceI.equals("1")) {
                            System.out.println("Danh sách đội bóng " + Vleague.teams.get(choice - 1).getNameTeam() + ": ");
                            if (Vleague.players.size()==0){
                                System.out.println("đội bóng chưa có cầu thủ nào!");
                            }else {
                                for (FootballPlayer player : Vleague.players) {
                                    if (player.getNameTeam().equals(Vleague.teams.get(choice - 1).getNameTeam())) {
                                        System.out.println(player);
                                    }
                                }
                            }
                            checkk =false;
                        }else if (choiceI.equals("2")){
                            System.out.println("Điền thông tin cầu thủ");
                            System.out.println("Tên cầu thủ: ");
                            String name = input.nextLine();

                            System.out.println("Ngày sinh (DD MM YYYY): ");
                            int[] list = new int[3];
                            for (int j = 0; j < list.length; j++){
                                list[j] = input.nextInt();
                            }
                            LocalDate date = LocalDate.of(list[2], list[1], list[0]);

                            input.nextLine();
                            System.out.println("Số áo: ");
                            String numberPlayer = input.nextLine();

                            System.out.println("Vị trí thi đấu: ");
                            String position = input.nextLine();

                            String nameTeam = Vleague.teams.get(choice - 1).getNameTeam();

                            FootballPlayer player = new FootballPlayer(name, date,numberPlayer, position, nameTeam);

                            playerMethod.add(player);
                            System.out.println("Thêm thành công!");
                            checkk = false;

                        }else if (choiceI.equals("3")){
                            System.out.println("Nhập vào id cầu thủ: ");
                            int id = input.nextInt();
                            for (FootballPlayer player: Vleague.players) {
                                if ( player.getId() == id && player.getNameTeam().equals(Vleague.teams.get(choice - 1).getNameTeam())) {
                                    System.out.println(player);
                                    boolean checkdelete = true;
                                    while (checkdelete) {
                                        System.out.println("bạn có muốn xóa cầu thủ này khỏi đội? (Y/N)");
                                        String choicedelete = input.nextLine();
                                        if (choicedelete.equals("Y")) {
                                            player.setNameTeam("Tự do");
                                            System.out.println("Chấm dứt hợp đồng!");
                                            checkdelete = false;
                                        } else if (choicedelete.equals("N")) {
                                            checkdelete = false;
                                        } else System.out.println("vui lòng nhập đúng.");
                                    }
                                    return;
                                }
                            }
                            checkk = false;
                        }else if (choiceI.equals("4")){
                            System.out.println("nhập vào id cầu thủ: ");
                            int id = input.nextInt();
                            for (FootballPlayer player: Vleague.players) {
                                if (player.getId() == id) {
                                    System.out.println(player);
                                }
                            }
                            check = false;
                        }else if (choiceI.equals("0")){
                            break;
                        }
                    }
                }
            }
        }
    }


    public static void updateTeam(TeamMethod teamMethod){
        Scanner input = new Scanner(System.in);
        if (Vleague.teams.size()==0){
            System.out.println("chưa có đội bóng nào để sửa!");
            return;
        }
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
        System.out.println("bạn đã Sửa thành công!");
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
        System.out.println("bạn đã thêm thành công!");
    }

    public static void removeTeam(TeamMethod teamMethod){
        if (Vleague.teams.size()==0){
            System.out.println("chưa có đội bóng nào để xửa!");
            return;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên đội bị mất quyền thi đấu: ");
        String name = input.nextLine();
        teamMethod.remove(name);
        System.out.println("bạn đã xóa thành công!");
    }

}
