import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelperMethods {
    public HelperMethods(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"wd-navbar\"]/div/div[2]/nav/a[5]")
    WebElement blogNavbar;

    //Sitemap repository
    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[3]/div/div[1]/div[3]/div/a")
    WebElement BTN_sitemap;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div/div[2]/ul/li[1]/a")
    WebElement BTN_HomeSM;
    @FindBy (className = "Projects")
    WebElement BTN_ProjectsSM;
    @FindBy (className = "About")
    WebElement BTN_AboutSM;
    @FindBy (className = "Services")
    WebElement BTN_ServicesSM;
    @FindBy (className = "Blog")
    WebElement BTN_BlogSM;
    @FindBy (className = "Team")
    WebElement BTN_TeamSM;
    @FindBy (className = "Careers")
    WebElement BTN_CareersSM;
    @FindBy (className = "Privacy Policy")
    WebElement BTN_PrivacySM;
    @FindBy (className = "Contact")
    WebElement BTN_ContactSM;

    public void clickBlog(){
        blogNavbar.click();
    }

    //Sitemap click methods
    public void clickSitemap(){
        BTN_sitemap.click();
    }
    public void clickHomeSM(){
        BTN_HomeSM.click();
    }
    public void clickProjectsSM(){
        BTN_ProjectsSM.click();
    }
    public void clickAboutSM(){
        BTN_AboutSM.click();
    }
    public void clickServicesSM(){
        BTN_ServicesSM.click();
    }
    public void clickBlogSM(){
        BTN_BlogSM.click();
    }
    public void clickTeamSM(){
        BTN_TeamSM.click();
    }
    public void clickCareersSM(){
        BTN_CareersSM.click();
    }
    public void clickPrivacySM(){
        BTN_PrivacySM.click();
    }
    public void clickContactSM(){
        BTN_ContactSM.click();
    }
}
