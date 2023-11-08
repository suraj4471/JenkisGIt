package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@class='a-carousel-card']//*[@alt='Play & learn']")private WebElement OutdoorAndSportsToy ;
	@FindBy(xpath="//*[@id='nav-cart']")private WebElement cart;
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement SignInBut;
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']")private WebElement Signin;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement emailField;
    @FindBy(xpath="//input[@class='a-button-input']")private WebElement ContinueButton;
    @FindBy(xpath="//input[@id='ap_password']")private WebElement passwordField;
    @FindBy(xpath="//input[@id='signInSubmit']")private WebElement FinalSingnin;
    
    
    WebDriverWait wait;
    public HomePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	 wait= new WebDriverWait(driver,Duration.ofSeconds(100));
    }
    
    public String TitleOfPage()
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    public boolean VerifyCart()
    {
    	boolean display=cart.isDisplayed();
    	return display;
    }
    
    public void goToSigninPage()
    {
    
    	Actions act = new Actions(driver);
    	act.moveToElement(SignInBut).perform();
    	Signin.click();
    	
    }
    public void enterUsername(String name)
    {
    	emailField.sendKeys(name);
    	ContinueButton.click();
    }
    
    public void enterPassword(String pass)
    {
    	passwordField.sendKeys(pass);
    	FinalSingnin.click();
    	
    }
    public void enterToOutdoorSports()
    {
    	wait.until(ExpectedConditions.visibilityOf(OutdoorAndSportsToy));
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();",OutdoorAndSportsToy);
    }
    

}
