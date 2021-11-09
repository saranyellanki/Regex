package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordRule2 {
    PasswordRule2 password;
    @Before
    public void initializeTest(){
        password = new PasswordRule2();
    }
    @Test
    public void givenPasswordWhenAddedShouldReturnBoolean(){
        boolean checkPass = password.isPassword("Bgdoh@nwe");
        Assert.assertTrue(checkPass);
        boolean checkPass1 = password.isPassword("kidvoh#4ef");
        Assert.assertFalse(checkPass1);
    }
}