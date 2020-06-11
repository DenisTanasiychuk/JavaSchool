package SGUTask2005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();



        for (int i=0;i<n;i++){
            list.add((int) (Math.random()*10));
        }
        for (int i:list){
            System.out.println(i);
        }
        indexMin(list);


    }
    public static void indexMin(ArrayList<Integer> list){
        int min =  list.get(0);
        int index = 0;
        for (int i=0;i<list.size();i++){
            if (list.get(i) < min){
                min = list.get(i);
                index = i + 1;
            }
        }
        System.out.println(index );
    }
}
