package entities;

public class Account {

    private int accountNumber;
    private String holderName;
    private double accountBalance;

    public Account() {

    }

    public Account(int accountNumber, String holderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
    }

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void makeDeposit(double depositBalance) {
        accountBalance += depositBalance;
    }

    public void makeWithdrawal(double withdrawalBalance) {
        accountBalance -= withdrawalBalance + 5.00;
    }

    public String toString() {
        return String.format("O nome do titular é %s e o número de sua conta é %d.\nHá R$%.2f depositados nesta conta atualmente.\n", holderName, accountNumber, accountBalance);
    }
}
