package com.example.cookiestorews.Cookie.datalayer;

import jakarta.persistence.Embeddable;

@Embeddable
public class CookieIdentifier {
    private String CookieId;

    CookieIdentifier(){

    }

    public CookieIdentifier(String CookieId){ this.CookieId = CookieId; }

    public String getCookieId(){return CookieId;}
}
