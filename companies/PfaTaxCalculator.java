package companies;

public class PfaTaxCalculator implements TaxCalculator {

    @Override
    public double calculateTax(int profit) {
        return profit * 0.15;
    }
    
}
