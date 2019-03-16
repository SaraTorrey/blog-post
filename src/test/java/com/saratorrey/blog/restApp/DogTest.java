package com.saratorrey.blog.restApp;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDog() {

        Doggy nino = new Doggy();
        nino.humanAge = 5;

        Assert.assertEquals( 25, nino.dogAge() );
    }
}

