package com.logique.dao;

import com.logique.model.Url;

import java.util.List;

public interface UrlDAO {
    String insert(String url, String email);
    List<Url> findAll();
}