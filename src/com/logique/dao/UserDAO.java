package com.logique.dao;

import com.logique.model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.logging.Logger;

@Repository
public class UserDAO{
    @Autowired
    private SessionFactory sessionFactory;
    public void insert(User user){

    }
}
