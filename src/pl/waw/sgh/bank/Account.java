package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class Account {

    private Integer accountID;

    private BigDecimal balance = new BigDecimal(0);

    private String currency = "EUR";

    private Customer customer;

    public Account(Integer accountID, String currency, Customer customer) {
        this.accountID = accountID;
        this.currency = currency;
        this.customer = customer;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    //TODO To be deleted later
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    //TODO implement - check conditions - negative amount
    public void deposit(Double toDeposit) {
        //BigDecimal.valueOf(toDeposit)
        //balance.add
    }

    //TODO implement - check conditions - negative amount, not enough money to charge
    public void charge(Double toCharge) {


    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", customer=" + customer.getCustomerID() + "_" + customer.getLastName() +
                '}';
    }
}
