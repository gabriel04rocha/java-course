package entities;

public class NaturalPerson extends Person {

    private Double healthExpenditures;

    public NaturalPerson(Double income, String name, Double healthExpenses) {
        super(income, name);
        this.healthExpenditures = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenditures;
    }

    public void setHealthExpenses(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Double getTaxes() {
        double finalTax;

        if (income >= 20000) {
            finalTax = income * 0.25;
        } else {
            finalTax = income * 0.15;
        }

        if (healthExpenditures > 0) {
            finalTax -= (healthExpenditures * 0.5);
            return finalTax;
        }
        return finalTax;
    }
}
