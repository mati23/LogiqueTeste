package com.logique.service;

import com.logique.model.User;

public interface UserService {
    public void insert(User p);
    public User getUserByEmail(String email);
    public boolean validateUser(String email, String password);
}
