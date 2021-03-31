package sample;
import org.testng.*;

/**
 * Override of the ITestListener interface for example 11 in TestNg tutorial
 */
public class MyListner implements ITestListener{

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start Test execution"+ context.getName());
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Start Test skipped"+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Start Test success"+ result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Start Test failure"+ result.getName());
    }
}
