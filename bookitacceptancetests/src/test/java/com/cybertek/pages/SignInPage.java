package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(id = "prependedInput")
    public WebElement storemanagerusername ;

    @FindBy(id = "prependedInput2")
    public WebElement storemanagerpassword;

    @FindBy(id="_submit")
    public WebElement signIn;

    public void login(String storemanagerusername, String storemanagerpassword){

        this.storemanagerusername.sendKeys(storemanagerusername);
        this.storemanagerpassword.sendKeys(storemanagerpassword);
        signIn.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("dashboard"));


    }
}
