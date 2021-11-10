package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestLastName {
    private final String name;
    private final boolean expected;
    private LastName lastName;

    @Before
    public void initializeClass(){
        lastName = new LastName();
    }

    public TestLastName(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> regexList(){
        return Arrays.asList(new Object[][] {
                {"Saran",true} , {"Yellanki",true} ,
                {"SaRan",false} , {"Saran Yellanki",false}
        });
    }
    @Test
    public void testRegex(){
        Assert.assertEquals(expected,lastName.isLastName(name));
    }
}
