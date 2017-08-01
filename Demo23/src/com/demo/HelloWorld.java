package com.demo;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
//@ApplicationScoped // Working without "implements Serializable"
//@RequestScoped //Working without "implements Serializable"
@ViewScoped  // Working with implements Serializable
//@SessionScoped // Working with implements Serializable
public class HelloWorld implements Serializable{

    private String message = "Hello World JSF 2.3";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
