package HomeTask3;

public  class TerminalServer implements Terminal{
    public static int Account = 0;







    @Override
    public void chek() {
        System.out.println("Балан на карте равен - " + Account);
    }

    @Override
    public void getCash(int Cash) {
        if (Cash > Account){
            System.out.println("Не достаточно средств на карте");

        }else if (Cash%100 == 0){
            Account-=Cash;
        }else {
            System.out.println("Сумма которую вы хотите снять не кратна 100");
        }
    }

    @Override
    public void putCash(int Cash) {
        if (Cash%100 == 0){
            Account+=Cash;
        }else {
            System.out.println("Сумма которую вы хотите положить не кратна 100");
        }

    }
}
