package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private final String emailId;
    private final boolean expected;
    private EmailValidation email;

    @Before
    public void initializeClass(){
        email = new EmailValidation();
    }

    public EmailValidationTest(String emailId, boolean expected) {
        this.emailId = emailId;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList(){
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com",true} , {"abc-100@yahoo.com",true} ,
                {"abc.100@yahoo.com",true} , {"abc111@yahoo.com",true},
                {"abc-100@abc.net",true} , {"abc.100@abc.com.au",true},
                {"abc@1.com",true} , {"abc@yahoo.com.com",true},
                {"abc+100@yahoo.com",true} , {"abc",false}, {"abc@.com.my",false},
                {"abc123@gmail.a",false} , {"abc123@.com",false} , {"abc123@.com.com",false},
                {".abc@abc.com",false} , {"abc()*@gmail.com",false} , {"abc@%*.com",false},
                {"abc..2002@gmail.com",false} , {"abc.@gmail.com",false} ,{"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false} , {"abc@gmail.com.aa.au",false}
        });
    }
    @Test
    public void testRegex(){
        Assert.assertEquals(expected,email.isEmail(emailId));
    }
}