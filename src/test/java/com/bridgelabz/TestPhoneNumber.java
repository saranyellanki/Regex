package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestPhoneNumber {
    private final String number;
    private final boolean expected;
    private PhoneNumber phoneNumber;

    @Before
    public void initializeClass(){
        phoneNumber = new PhoneNumber();
    }

    public TestPhoneNumber(String number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList(){
        return Arrays.asList(new Object[][] {
                {"91 9908934432",true} , {"9908934432",false} ,
                {"9 9908934432",false} , {"91 99089344323",false}
        });
    }
    @Test
    public void testRegex(){
        Assert.assertEquals(expected,phoneNumber.isPhoneNumber(number));
    }
}
