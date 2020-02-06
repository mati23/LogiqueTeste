package com.logique.service;

import com.logique.dao.UserDAO;
import com.logique.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void insert(User user){
        this.userDAO.insert(user);
    }

}
