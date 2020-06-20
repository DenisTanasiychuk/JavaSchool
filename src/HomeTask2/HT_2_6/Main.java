package HomeTask2.HT_2_6;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Comparator");
        arrayList.add("Сбер банк");
        arrayList.add("Второе задание");


        int i = (int) (Math.random() * 4);

        System.out.println(arrayList.get(i));
    }
}
