package entities;

public abstract class Person {

    protected Double income;
    protected String name;

    public Person(Double income, String name) {
        this.income = income;
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double getTaxes();
}
