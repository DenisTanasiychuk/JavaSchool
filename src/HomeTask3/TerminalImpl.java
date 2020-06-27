package HomeTask3;

import HomeTask3.Exeptions.IncorrectCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalImpl extends TerminalServer{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TerminalServer terminalServer = new TerminalServer();
    public  void terminalWork(int numberOperation) throws IOException {
        try {

            if (numberOperation == 1) {
                terminalServer.chek();
            }else if (numberOperation == 2) {
                System.out.println("Введите сумму которую вы хотите получить");
                int cashGet = Integer.parseInt(reader.readLine());
                terminalServer.getCash(cashGet);
                System.out.println("Ваш баланс сейчас - " + Account);
            }else if (numberOperation == 3) {
                System.out.println("Введите сумму которую вы хотите положить");
                int cashPut = Integer.parseInt(reader.readLine());
                terminalServer.putCash(cashPut);
                System.out.println("Ваш баланс сейчас - " + Account);

            }else {
                throw new IncorrectCommand("Такой команды пока не существует. Попробуйте ещё раз");
            }
        }catch (IncorrectCommand incorrectCommand){
            System.out.println(incorrectCommand.getMessage());
        }

    }




}
