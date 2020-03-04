import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WolfpackTests {
    WebDriver driver = new ChromeDriver();
    HelperMethods helper = new HelperMethods(driver);
    String url = "https://stage.wolfpack-digital.com/";
    String blogtext = "How to Manage Your Capital as a Startup";

    @BeforeClass
    public void openBrowser(){
        driver.get(url);
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    @Test(description = "Click on Blog from navbar")
    public void navNavigation(){
        Assert.assertEquals(1, 2);
        try{helper.clickBlog();
            if(driver.getPageSource().contains(blogtext))
                System.out.println("S-a gasit textul pe pagina");
            else
                System.out.println("Nu s-a gasit textul pe pagina");}
        catch(NoSuchElementException e){
            System.out.println("Elementul nu a putut fi gasit");
        }

    }
@Test(description = "Check if all the sitemap items redirect to the correct link")
public void sitemapItemsCheck () throws InterruptedException {
        String currentUrl;
        String urlHome = "https://stage.wolfpack-digital.com/";
        //Scroll page all the way down
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,20000)");
        try{
            helper.clickSitemap();
            try {
                helper.clickHomeSM();
            }
            catch(NoSuchElementException e){
                System.out.println("Butonul de Home nu s-a putut gasit");
            }
            Assert.assertEquals(driver.getCurrentUrl(), urlHome, "Da sunt");
        }
        catch(NoSuchElementException e){
            System.out.println("Nu s-a gasit butonul");
        }
}



}
