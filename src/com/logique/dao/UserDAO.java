package com.logique.dao;

import com.logique.model.User;
public interface UserDAO {
    void insert(User user);
    User getUserByEmail(String email);
    boolean validateUser(String email, String password);
}