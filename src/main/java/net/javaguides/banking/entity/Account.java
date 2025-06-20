package net.javaguides.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name = "accounts")
@Entity

public class Account {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
     @Column (name = "account_holder_name")
    private String accountHolderName ;
    private double balance ;

    public Account(long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
