package behavioral.command;

public class Demo {

    public static void main(String[] args) {

        BankWorker bankWorker = new BankWorker();
        bankWorker.addCommand(new BuyCurrency());
        bankWorker.addCommand(new SellCurrency());

        bankWorker.performCommands();
    }
}
