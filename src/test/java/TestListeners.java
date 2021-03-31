import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Example 11 TestNg Tutorial listeners in TestNG
 * Listeners can be added on Class level etc on the xml file
 *
 */
@Listeners(sample.MyListner.class)
public class TestListeners {


    @Test
    void test1(){
        System.out.println("Test 1");
    }

    @Test
    void test2(){
        Assert.assertEquals("ff","gg");
    }

    @Test
    void test3(){
       throw new SkipException("Skipped school");
    }



}
