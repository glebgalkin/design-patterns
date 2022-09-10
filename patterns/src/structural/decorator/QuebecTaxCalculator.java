package structural.decorator;

public class QuebecTaxCalculator extends FederalTaxCalculator{
    public QuebecTaxCalculator(int income) {
        super(income);
    }

    private int includeQuebecCut(){
        return getIncome() + (int)Math.floor(this.getIncome()*0.15);
    }

    @Override
    public int getIncome(){
        return super.getIncome();
    }

    @Override
    public int calculateIncomeTax(int income){
        return  includeQuebecCut() + super.calculateIncomeTax(getIncome());
    }
}
