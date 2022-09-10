package structural.decorator;

public class FederalTaxCalculator implements TaxCalculator{

    private int income;

    public FederalTaxCalculator(int income){
        this.income = income;
    }

    @Override
    public int getIncome() {
        return this.income;
    }

    @Override
    public int calculateIncomeTax(int income) {
        return (int) Math.floor(income*0.10);
    }
}
