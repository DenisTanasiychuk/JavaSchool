package SGUTask2001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2001 {



        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            int a = Integer.parseInt(reader.readLine());


            int b = Integer.parseInt(reader.readLine());

            int c  = a + b;

            System.out.println(c);
        }

    }


