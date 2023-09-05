package companies;

public class Company {
    
    private String name;
    private int profit;
    private CompanyType type;
    private TaxCalculatorFactory taxCalculatorFactory;

    public Company(String name, int profit, CompanyType type) {
        this.name = name;
        this.profit = profit;
        this.type = type;
        this.taxCalculatorFactory = new TaxCalculatorFactory(this.type);
    }

    public double calculateTax() {
        return taxCalculatorFactory.calculate(this.profit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    };

    public CompanyType getType() {
        return type;
    }

    public void setType(CompanyType type) {
        this.type = type;
    }

}
