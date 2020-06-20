package HomeTask2.HT_2_2;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("Java");
        arList.add("Comparator");
        arList.add("Сбер банк");
        arList.add("Второе задание");



//        Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));
        Set<String> treeSet = new TreeSet<>(new LineComparator());
        treeSet.addAll(arList);
        ArrayList<String> listOfStrings =  new ArrayList<>(treeSet);
        Collections.reverse(listOfStrings);

        listOfStrings.forEach(line ->System.out.println(line));


// a > b => 0

//        numbers.forEach(number -> System.out.println(number));






    }

}