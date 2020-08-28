package Program;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020,5, 9);
        LocalDate date2 = LocalDate.of(2020,8,9);
        LocalDate date3 = LocalDate.of(2020,7,9);
        List<LocalDate> list = new ArrayList<>();
        List<LocalDate> list2 = new ArrayList<>();
        list.add(date1);
        list.add(date2);
        list.add(date3);

        for (int i = 0; i < list.size()- 1 ; i++) {
            for (int j = list.size()-1; j > i  ; j--) {
                if (list.get(i).isAfter(list.get(j))){
                    LocalDate swap = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j - 1,swap);
                }
            }
        }
        System.out.println(list.toString());


    }
}
