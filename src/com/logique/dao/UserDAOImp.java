package com.logique.dao;

import com.logique.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.hibernate.query.Query;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void insert(User user){
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.persist(user);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public User getUserByEmail(String email){
        Session session = null;
        User user = null;
        try {
            session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from User where email=:email");
            query.setParameter("email",email);
            List<User> users = query.list();
            user = users.get(0);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public User getUserByEmail(String email, SessionFactory sf){
        Session session = null;
        User user = null;
        try {
            session = sf.getCurrentSession();
            Query query = session.createQuery("from User where email=:email");
            query.setParameter("email",email);
            List<User> users = query.list();
            user = users.get(0);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean validateUser(String email, String password){
        User validationUser = getUserByEmail(email);
        String hashedPassword = validationUser.getPasswordHash();
        return validationUser.getPasswordHash().equals(password) == true ? true : false;
    }
}
