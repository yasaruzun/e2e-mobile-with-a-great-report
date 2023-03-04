package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)),this);

    }

  @FindBy(xpath="//span[text()='Accepter & Fermer']")
    public WebElement btnAccepter;

    @FindBy(xpath = "//*[contains(@class,'alltricks-Header-menuItem--user')]")
    public WebElement btnProfil;


    @FindBy(partialLinkText = "Identifiez-vous")
    public WebElement monProfil;










}
