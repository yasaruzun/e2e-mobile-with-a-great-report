package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);

    }











}
