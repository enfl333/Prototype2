import org.testng.annotations.Test;


/***
 * Get the maven dependency working intellij Run working and run
 * the test in Priority order
 *
 * @author enrique
 *
 */
public class SecondTestCase {

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

    @Test(priority = 4)
    public void testFour(){
        System.out.println("TestNg nr 4");
    }


}
