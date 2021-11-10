package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordRule3 {
    PasswordRule3 password;
    @Before
    public void initializeTest(){
        password = new PasswordRule3();
    }
    @Test
    public void givenPasswordWhenAddedShouldReturnBoolean(){
        boolean checkPass = password.isPassword("Bgdoh7@nwe");
        Assert.assertTrue(checkPass);
        boolean checkPass1 = password.isPassword("kidv6h#4ef");
        Assert.assertFalse(checkPass1);
    }
}
