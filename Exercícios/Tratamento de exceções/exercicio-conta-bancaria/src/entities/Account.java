package entities;

import exceptions.AmountException;
import exceptions.NoBalanceException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(String holder, Double balance, Integer number, Double withdrawLimit) {
        this.holder = holder;
        this.balance = balance;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws AmountException, NoBalanceException {
        if (amount > withdrawLimit) {
            throw new AmountException("amount exceeds withdraw limit.");
        }
        if (balance - amount <= 0) {
            throw new NoBalanceException("not enough balance");
        }
        balance -= amount;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
