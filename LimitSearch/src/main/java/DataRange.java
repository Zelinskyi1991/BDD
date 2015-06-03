import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**As a user of the library catalogue,
I want advanced search options on the front page so that
I can quickly and easily refine my search.
I can delineate the search by date range.*/

public class DataRange {

	
	String btName=" ";
    String value=" ";
    String searchBar=" ";
    String material=" ";
    String data_range = " ";
    
 
    private WebDriver driver ;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Given("User imput $value in anvanced $searchBar")
    public void Get_value(WebDriver driver,String value,String searchBar)
    {
        driver.findElement(By.id(searchBar)).sendKeys(value);

    }
    @When("User can change $value and push the button $btnG")
    public void Push_button(WebDriver driver,String btName, String value, String searchBar)
    {
        driver.findElement(By.id(searchBar)).sendKeys(value);
        driver.findElement(By.name(btName)).click();
    }

    @Then("The user will search by data_range")
    public String Search_data_range (WebDriver driver,String material)
    {
        material=driver.getPageSource();
        return material;
    }


}

