package HomeTask2.HT_2_4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Comparator");
        arrayList.add("Сбер банк");
        arrayList.add("Второе задание");

        Collections.reverse(arrayList);

        arrayList.forEach(line ->System.out.println(line));
    }
}
