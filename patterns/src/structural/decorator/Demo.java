package structural.decorator;

public class Demo {

    public static void main(String[] args) {
        FederalTaxCalculator federalTaxCalculator = new FederalTaxCalculator(70000);
        System.out.println(federalTaxCalculator.calculateIncomeTax(federalTaxCalculator.getIncome()));

        QuebecTaxCalculator quebecTaxCalculator = new QuebecTaxCalculator(70000);
        System.out.println(quebecTaxCalculator.calculateIncomeTax(quebecTaxCalculator.getIncome()));
    }
}
