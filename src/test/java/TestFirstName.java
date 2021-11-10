import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFirstName {
    private final String name;
    private final boolean expected;
    private FirstName firstName;

    @Before
    public void initializeClass(){
        firstName = new FirstName();
    }

    public TestFirstName(String name, boolean expected) {
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
        Assert.assertEquals(expected,firstName.isFirstName(name));
    }
}