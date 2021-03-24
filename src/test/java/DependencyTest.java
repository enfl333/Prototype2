import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void startCar(){
        System.out.println("Starting car.");
    }

    @Test (dependsOnMethods = "startCar")
    public void driveCar(){
        System.out.println("driveCar");
    }


    @Test(dependsOnMethods = {"startCar","driveCar"})
    public void stopCar(){
        System.out.println("stopCar");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    public void parkCar(){
        System.out.println("parkCar");
    }



}
