package SGUTask2002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int sum = 0;

        for (int p : list){
            sum += p;
        }
        System.out.println(sum);
    }
}
