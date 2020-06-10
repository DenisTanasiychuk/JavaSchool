package SGUTask.Task2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        chekYear(year);

    }
    public static void chekYear(int year){
        if (year%4==0&year%100!=0|year%400==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
