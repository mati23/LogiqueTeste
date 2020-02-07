package com.logique.dao;

import com.logique.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface UserDAO {
    void insert(User user);
    User getUserByEmail(String email);
    User getUserByEmail(String email, SessionFactory sf);
    boolean validateUser(String email, String password);
}