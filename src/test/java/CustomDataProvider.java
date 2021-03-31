import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "customData")
    public Object[][] getData(){
        Object[][] data = {{"custom1@gmail.com","custom1"},{"custom2@gmail.com","custom1"}};
        return data;
    }
}
