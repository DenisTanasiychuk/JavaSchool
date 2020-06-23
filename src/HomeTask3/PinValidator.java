package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinValidator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TerminalImpl terminal = new TerminalImpl();
    public static  int pinCode = 123;
    int count = 0;

    public void enterPin() throws IOException, InterruptedException {
        while (true){
            chekPin(Integer.parseInt(reader.readLine()));
        }
    }

    public  void chekPin(int intputPin) throws InterruptedException, IOException {




        while (true) {

            if (intputPin == pinCode){
                System.out.println("Введите номер операции: ");
                System.out.println("1 - Проверка баланса карты.");
                System.out.println("2 - Получить деньги");
                System.out.println("3 - Положить деньги на карту");
                int numberOperatiin = Integer.parseInt(reader.readLine());
            terminal.terminalWork(numberOperatiin);
            }

            if (count == 2){
                for (int i = 5; i > 0; i--){
                    System.out.println("Вы 3 раза указакли неверный пин-код. Следующую попытку можно сделать через " + i + " секунд.");
                    Thread.sleep(1000);
                }
                count = 0;
            }
            if (intputPin != pinCode){
                System.out.println("Вы ввели не верный пин-код");
                count++;
                enterPin();


            }
        }
    }

}
