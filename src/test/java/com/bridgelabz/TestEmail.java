package com.bridgelabz;

import com.bridgelabz.uc3_Email.Email;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestEmail {
    private final String emailId;
    private final boolean expected;
    private Email email;

    @Before
    public void initializeClass(){
        email = new Email();
    }

    public TestEmail(String emailId, boolean expected) {
        this.emailId = emailId;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList(){
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com",true} , {"abc-100@yahoo.com",true} ,
                {"abc.100@yahoo.com",true} , {"abc111@abc.com",true},
                {"abc-100@abc.net",true} , {"abc.100@abc.com.au",true},
                {"abc@1.com",true} , {"abc@yahoo.com.com",true},
                {"abc+100@yahoo.com",true} , {"abc@.com",false}
        });
    }
    @Test
    public void testRegex(){
        Assert.assertEquals(expected,email.isEmail(emailId));
    }
}