package SGUTask2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i=0;i<n;i++){
            list.add((int) ((Math.random()*10)));
        }

        for (int i=0;i<n;i++){
            if (i%2!=0){
                list.set(i,list.get(i)*(-1));
            }
        }
        for (int p:list){
            System.out.println(p);
        }
        for (int p:list){
            sum+=p;
        }

        System.out.println("Альтернированная сумма равно = " + sum);

    }
}
