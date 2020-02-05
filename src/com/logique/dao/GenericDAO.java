package com.logique.dao;

import com.logique.model.User;

import javax.persistence.EntityManager;

public abstract class GenericDAO {

    private Class<User> entityClass;
    private EntityManager em;

    public GenericDAO(Class<User> classeDePersistencia, EntityManager em) {
        this.entityClass = classeDePersistencia;
        this.em = em;
    }
}