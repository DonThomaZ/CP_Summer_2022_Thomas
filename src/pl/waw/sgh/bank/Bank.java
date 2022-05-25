package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    private Integer lastCustomerID = 0;

    private Integer lastAccountID = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastName, String email) {
        Customer cust = new Customer(lastCustomerID++, firstName, lastName, email);
        customerList.add(cust);
        return cust;
    }

    public Account newAccount(Customer customer, String currency) {
        Account acc = new Account(lastAccountID++, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newAccount(Customer customer) {
        return newAccount(customer, "EUR");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ",\n cust=" + customerList +
                ",\n acc=" + accountList +
                '}';
    }
}
