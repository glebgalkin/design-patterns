package behavioral.command;

public class BuyCurrency implements Command{

    private String dollar = "US_DOLLAR";
    private String quantity = "100$";

    @Override
    public void execute() {
        System.out.println("Bought " + dollar + " amount: " + quantity);
    }
}
