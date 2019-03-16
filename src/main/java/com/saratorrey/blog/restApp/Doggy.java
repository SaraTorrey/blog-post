package com.saratorrey.blog.restApp;

public class Doggy {

    public int humanAge = 0;

    public void bark() {

        System.out.println( "Woof!" );
        System.out.println( "Ruff!" );
        System.out.println( "Grrrr!" );
    }

    public void emailBarks() {

        // send email


    }

    public int dogAge() {

        return humanAge * 5;
    }
}