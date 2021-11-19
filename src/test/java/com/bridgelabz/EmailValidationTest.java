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
                {"abc+100@yahoo.com",true} , {"abc",false}
        });
    }
    @Test
    public void testRegex() throws InvalidEmailException {
            Assert.assertEquals(expected,email.isEmail(emailId));
    }
}