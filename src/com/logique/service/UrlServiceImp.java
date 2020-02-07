package com.logique.service;

import com.logique.dao.UrlDAO;

import com.logique.model.Url;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UrlServiceImp implements UrlService {
    private UrlDAO urlDAO;

    public void setUrlDAO(UrlDAO urlDao){
        this.urlDAO = urlDao;
    }

    @Override
    @Transactional
    public String insert(String url, String email){
      return  this.urlDAO.insert(url, email);
    }
    @Override
    @Transactional
    public List<Url> findAll(String email){
        return this.urlDAO.findAll(email);
    }


}
