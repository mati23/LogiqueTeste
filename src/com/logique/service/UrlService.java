package com.logique.service;

import com.logique.model.Url;

import java.util.List;

public interface UrlService {
    public String insert(String url, String email);
    List<Url> findAll(String email);
}
