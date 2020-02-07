package com.logique.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name="incrementor", strategy = "increment")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;

    @Column(name="password_hash")
    private String passwordHash;

    @OneToMany
    private List<Url> urls = new ArrayList<Url>();

    public List<Url> getUrls(){
        return this.urls;
    }
    public void setUrls(List<Url> url){
        this.urls = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
