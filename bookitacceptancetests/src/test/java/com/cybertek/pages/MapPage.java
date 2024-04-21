package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MapPage {

    public MapPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[1]/a/span")
    public WebElement dashboard ;

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement dashboard2 ;

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/a/span")
    public List<WebElement> allRooms;
}
