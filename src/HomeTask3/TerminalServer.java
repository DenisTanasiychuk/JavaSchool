package HomeTask3;

import HomeTask3.Exeptions.NegativNumber;
import HomeTask3.Exeptions.NotCranna100;
import HomeTask3.Exeptions.NotEnoughFunds;

public  class TerminalServer implements Terminal{
    public static int Account = 0;






    @Override
    public void chek() {
        System.out.println("Балан на карте равен - " + Account);
    }

    @Override
    public void getCash(int Cash) {
        try {

            if (Cash < 0){
                throw new NegativNumber("Введённая сумма не может быть меньше 0");
            }else if (Cash > Account) {
                throw new NotEnoughFunds("Не достаточно средств на карте");

            } else if (Cash % 100 == 0) {
                Account -= Cash;
            } else {
                throw new NotCranna100("Сумма которую вы хотите снять не кратна 100");
            }
        }catch (NegativNumber | NotEnoughFunds | NotCranna100 myExeptions){
            System.out.println(myExeptions.getMessage());
        }
    }

    @Override
    public void putCash(int Cash) {
        try {

            if (Cash < 0){
                throw new NegativNumber("Введённая сумма не может быть меньше 0");
            }else if (Cash % 100 == 0) {
                Account += Cash;
            } else {
                throw new NotCranna100("Сумма которую вы хотите положить не кратна 100");
            }

        }catch (NegativNumber | NotCranna100 myExeptions){
            System.out.println(myExeptions.getMessage());
        }
    }
}
