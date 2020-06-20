package HomeTask2.HT_2_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> arList = new ArrayList<>();
        arList.add("Первое слово");
        arList.add("Второе слово");
        arList.add("Третье слово");
        arList.add("Первое слово");


        Set<String> set = new HashSet<>();

        for (String s : arList){
            set.add(s);
        }
        int count = 0;
        for (String s : set){
            count++;
            System.out.println(s);
        }
        System.out.println(count);
    }
}
