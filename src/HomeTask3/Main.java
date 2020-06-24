package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PinValidator pinValidator = new PinValidator();
        System.out.println("Введите пин-код:");
        pinValidator.enterPin();


    }
}
