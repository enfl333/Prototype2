import org.testng.annotations.Test;

public class GroupingTests {
    @Test(groups = {"smoke"})
    public void testOne(){
        System.out.println("GT TestNg nr 1. SmokeTest");
    }

    @Test(groups = {"regression"})
    public void testTwo(){
        System.out.println(" GT TestNg nr 2");
    }

    @Test(groups = {"smoke"})
    public void testThree(){
        System.out.println(" GT TestNg nr 3. Smoke test");
    }

    @Test(groups = {"regression"})
    public void testFour(){
        System.out.println("GT  TestNg nr 4");
    }
}
