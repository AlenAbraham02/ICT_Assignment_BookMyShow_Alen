package Test_script;

import Launch_Browser.Launch;
import POM.List_your_show;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class List_your_show_script extends Launch {
    @Test(priority =0)
    public void whatCanYouHost() {
        List_your_show list_your_show = new List_your_show(driver);
        list_your_show.ListYourShowClick();
        boolean status = list_your_show.host();
        Assert.assertEquals(true, status);
        WebElement scrollelement = driver.findElement(By.xpath("//div[contains (text(), 'Sports')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();
    }

    @Test(priority = 1)
    public void WhatAreTheServices() {
        List_your_show list_your_show = new List_your_show(driver);
        list_your_show.ListYourShowClick();
        boolean status = list_your_show.services();
        Assert.assertEquals(true, status);
        WebElement scrollelement = driver.findElement(By.xpath("//div[contains (text(), 'On ground support  & gate entry management')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scrollelement);
        actions.perform();

    }

    @Test(priority = 2)
    public void reportsBusinessInsightsDetails() {
        List_your_show list_your_show = new List_your_show(driver);
        list_your_show.ListYourShowClick();
        list_your_show.reportClick();
        boolean status = list_your_show.report();
        Assert.assertEquals(true, status);

    }
}