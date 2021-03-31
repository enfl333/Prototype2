import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/****
 *  TestNG Data provider example Nr: 9
 *
 */
public class TestDataProvider {

    @Test(dataProvider = "loginDataProvider")
    public void loginTest(String email,String pwd){
        System.out.println("Email: "+email+ " Password:"+pwd);
    }

    @Test(dataProvider = "customData",dataProviderClass = CustomDataProvider.class)
    public void loginCustomTest(String email,String pwd){
        System.out.println("Custom Email: "+email+ "Custom Password:"+pwd);
    }


    @DataProvider (name = "loginDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"abc@gmail.com","abc"},{"def@gmail.com","def"},{"ghi@gmail.com","ghi"}};
        return data;
    }



}
