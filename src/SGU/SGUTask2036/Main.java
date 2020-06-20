package SGU.SGUTask2036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();


        for (int i=0; i<n;i++){
            list.add(reader.readLine());
        }



    }
}
