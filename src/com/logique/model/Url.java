package com.logique.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table(name="Urls")
public class Url {
    @Id
    @Column(name="id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name="incrementor", strategy = "increment")
    private int id;

    @Column(name="origin_url")
    private String originUrl;
    @Column(name="short_url")
    private String shortUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
