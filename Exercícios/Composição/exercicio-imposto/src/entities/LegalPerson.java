package entities;

public class LegalPerson extends Person {

    private Integer employeeNumber;

    public LegalPerson(Double income, String name, Integer employeeNumber) {
        super(income, name);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public Double getTaxes() {
        if (employeeNumber > 10) {
            return income * 0.14;
        }
        return income * 0.16;
    }

}
