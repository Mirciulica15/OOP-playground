package companies;

public class TaxCalculatorFactory {
    
    private TaxCalculator taxCalculator;

    public TaxCalculatorFactory(CompanyType type) {
        switch (type) {
            case SRL:
                taxCalculator = new SrlTaxCalculator();
                break;
            case PFA:
                taxCalculator = new PfaTaxCalculator();
                break;
            default:
                taxCalculator = new SrlTaxCalculator();
                break;
        }
    }

    public double calculate(int profit) {
        return taxCalculator.calculateTax(profit);
    }

}
