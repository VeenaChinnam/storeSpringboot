package net.yorksolutions.storespringboot.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    public Long id;
    public String name;
    @OneToMany
//    Account owner;
    public Set<Account> managesAccounts;

    public Admin(String name) {
        this.name = name;
    }

    public Admin(){ }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
