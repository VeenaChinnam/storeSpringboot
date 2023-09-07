package net.yorksolutions.storespringboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    GeneratedValue - generates the id for us , Sequence- in the sequencial order 1,2,3...
    private Long id;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;
    public Account(){}

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
