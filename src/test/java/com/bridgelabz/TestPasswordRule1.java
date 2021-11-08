package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestPasswordRule1 {
    private final String password;
    private final boolean expected;
    private PasswordRule1 passwordObj;

    @Before
    public void initializeClass() {
        passwordObj = new PasswordRule1();
    }

    public TestPasswordRule1(String password, boolean expected) {
        this.password = password;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList() {
        return Arrays.asList(new Object[][]{
                {"nfgoi32i", true}, {"#4piwjr@", true},
                {"##2@or", false}, {"@1!334jf", true}
        });
    }

    @Test
    public void testRegex() {
        Assert.assertEquals(expected, passwordObj.isPassword(password));
    }
}
