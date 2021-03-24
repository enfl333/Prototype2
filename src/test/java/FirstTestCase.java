import org.testng.annotations.*;


/**
 *
 */
public class FirstTestCase {

    @BeforeClass
    public void runBeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void runAfterClass(){
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void runAfterMethod(){
        System.out.println("Run after each Method...");
    }

    @BeforeMethod
    public void runBeforeMethod(){
        System.out.println("Run before each Method...");
    }

    @BeforeTest
    public void runBeforeEachTest(){
        System.out.println("Run before each Test...");
    }

    @AfterTest
    public void runAfterEachTest(){
        System.out.println("Run after each Test...");
    }

    @Test(priority = 1)
    public void testOne(){
        System.out.println("TestNg nr 1");
    }

    @Test(priority = 2)
    public void testTwo(){
        System.out.println("TestNg nr 2");
    }

    @Test(priority = 3)
    public void testThree(){
        System.out.println("TestNg nr 3");
    }

    @Test(priority = 4, enabled = false)
    public void testFour(){
        System.out.println("TestNg nr 4");
    }


    @Override
    public String toString() {

        return "ToString";
    }
}
