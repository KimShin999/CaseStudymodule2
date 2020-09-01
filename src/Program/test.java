package Program;

import Entities.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.printf("\t%1s %15s %15s %15s \n", "STT", "ĐỘI BÓNG" , "HLV" , "ĐIỂM");
//        test1();
//        test2();
    }

    public static void test2(){
        List list = new ArrayList();
        list.add("ádsa");
        list.add("jkdshjdsa");
        System.out.println(list.size());
    }


    public static void test1(){
        List<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.thêm từ vào chuỗi");
            System.out.println("2. bạn chon từ mà bạn muốn in ra");
            int choicee = Integer.parseInt(scanner.nextLine());
            boolean a =true;
            switch (choicee){
                case 1:
                    while(a){
                        System.out.println("nhập vào");
                        String s = scanner.nextLine();
                        list.add(s);
                        if (s.equals("0")){
                            a = false;
                        }
                    }
                    break;
                case 2:
                    int choice = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < list.size()-1 ; i++) {
                        if (choice==i){
                            System.out.println(list.get(i-1));
                        }
                    }
                    break;
            }
        }while (true);
    }
}

