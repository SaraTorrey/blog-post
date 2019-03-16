package com.saratorrey.blog.restApp;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testReturnHiThere( ){

        Person sara = new Person();
        Assert.assertEquals( "Hi There", sara.HiThere() );
        Assert.assertFalse( !sara.HiThere().equals( "Hi There" ) );


    }

    @Test
    public void shouldReturnHelloSara() {
        Person person = new Person();
        Assert.assertEquals( "Hello Sara", person.hello("Sara") );
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Assert.assertEquals( 3, Person.numberOfPersons() );
    }
}