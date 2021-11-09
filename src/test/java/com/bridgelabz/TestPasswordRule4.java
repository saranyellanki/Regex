package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordRule4 {
    PasswordRule4 password;
    @Before
    public void initializeTest(){
        password = new PasswordRule4();
    }
    @Test
    public void givenPasswordWhenAddedShouldReturnBoolean(){
        boolean checkPass = password.isPassword("Bgdoh@nwe");
        Assert.assertTrue(checkPass);
        boolean checkPass1 = password.isPassword("kidv6h#4ef");
        Assert.assertTrue(checkPass1);
    }
}
