package com.example.enterpriseapp;

import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanInterface{
    public String sayHello(){
        return "Helloo World!";
    }
}


