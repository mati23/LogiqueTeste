package com.logique.service;

import com.logique.dao.UrlDAO;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UrlServiceImp implements UrlService {
    private UrlDAO urlDAO;

    public void setUrlDAO(UrlDAO urlDao){
        this.urlDAO = urlDao;
    }

    @Override
    @Transactional
    public void insert(String url, String email){
        this.urlDAO.insert(url, email);
    }


}
