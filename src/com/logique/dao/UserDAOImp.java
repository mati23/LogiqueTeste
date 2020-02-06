package com.logique.dao;

import com.logique.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

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
}
