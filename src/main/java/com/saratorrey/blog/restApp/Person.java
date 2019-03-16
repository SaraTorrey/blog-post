package com.saratorrey.blog.restApp;

public class Person {

    private static int personCounter;

    public static int numberOfPersons() {
        return personCounter;
    }


    public Person() {
        personCounter++;
    }
    public String HiThere() {

        return "Hi There";
    }

    public Integer aValue() {

        return 1;
    }

    public String hello( String name ) {

        return ( "Hello " + name );
    }
}