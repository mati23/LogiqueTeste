package com.logique.dao;

import com.logique.model.Url;
import com.logique.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

@Repository
public class UrlDAOImp implements UrlDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    private String idToShortURL(int n)
    {
        // Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuffer shorturl = new StringBuffer();

        // Convert given integer id to a base 62 number
        while (n > 0)
        {
            // use above map to store actual character
            // in short url
            shorturl.append(map[n%31]);
            n = n/31;
        }

        // Reverse shortURL to complete base conversion


        return shorturl.reverse().toString();
    }

    @Override
    public String insert(String url, String email){
        Session session = null;
        UserDAOImp userDAOImp = new UserDAOImp();
        User user = userDAOImp.getUserByEmail(email,sessionFactory);
        String shortUrl = "";
        int aux = 0;
        for(int i=0; i<url.length();i++){
            char ch = url.charAt(i);
            int intChar = ch;
            aux = aux + intChar;
        }
        int timeStamp = (int) (new Date().getTime()/1000);
        shortUrl = this.idToShortURL(aux + timeStamp);

        try {
            session = sessionFactory.getCurrentSession();
            Url newUrl = new Url();
            newUrl.setOriginUrl(url);
            newUrl.setShortUrl("lgq.br/"+shortUrl);
            newUrl.setUserId(user);
            session.persist(newUrl);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "lgq.br/"+shortUrl;
    }

    @Override
    public List<Url> findAll(){
        Session session = null;
        List<Url> urls = null;
        try{
            session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("from Url");
            urls = query.list();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return urls;
    }

}
