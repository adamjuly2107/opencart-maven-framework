import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Test {
    @BeforeClass
    public void beforeClass(){

    }

    @org.testng.annotations.Test
    public void Test() {
        driver = new EdgeDriver();
        driver.get("https://google.com");
    }

    private WebDriver driver;
}
