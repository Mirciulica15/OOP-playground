package companies;

public class SrlTaxCalculator implements TaxCalculator{

    @Override
    public double calculateTax(int profit) {
        return profit * 0.10;
    }
    
}
