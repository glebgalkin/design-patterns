package behavioral.command;

public class SellCurrency implements Command{

    private String dollar = "US_DOLLAR";
    private String quantity = "100$";

    @Override
    public void execute() {
        System.out.println("Sold " + dollar + " amount: " + quantity);
    }
}
