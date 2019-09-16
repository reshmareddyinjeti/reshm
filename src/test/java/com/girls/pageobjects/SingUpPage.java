package com.girls.pageobjects;

import com.girls.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends DriverFactory {
    @FindBy (linkText = "Account")
    private WebElement account;

    @FindBy(id = "email-address")
    private WebElement email;

    @FindBy(id="current-password")
    private WebElement pass;

    @FindBy(css=".sign-in-form")
    private WebElement signin;
    public void sign(){
        account.click();
        email.sendKeys("reshmareddyinjeti@gmail.com");
        pass.sendKeys("sandipani555");
        signin.click();
    }
}
