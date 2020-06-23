package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalImpl extends TerminalServer{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TerminalServer terminalServer = new TerminalServer();
    public  void terminalWork(int numberOperation) throws IOException {

        if (numberOperation == 1){
           terminalServer.chek();
        }
        if (numberOperation == 2 ){
            System.out.println("Введите сумму которую вы хотите получить");
            int cashGet = Integer.parseInt(reader.readLine());
            terminalServer.getCash(cashGet);
            System.out.println("Ваш баланс сейчас - " + Account);
        }
        if (numberOperation == 3){
            System.out.println("Введите сумму которую вы хотите положить");
            int cashPut = Integer.parseInt(reader.readLine());
            terminalServer.putCash(cashPut);
            System.out.println("Ваш баланс сейчас - " + Account);

        }


    }




}
