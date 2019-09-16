package com.girls.pageobjects;

import com.girls.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasketPage extends DriverFactory {
    public static String products;

    @FindBy(css=".add-to-trolley-button__text")
    private List<WebElement> AddToBasket;

    @FindBy (css=".ecomm-btn")
    private List<WebElement> GoToTrolly;

    public void selectCustomerProduct(String customerSelectedproduct) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (WebElement priceWebelement :AddToBasket) {
            if (priceWebelement.getText().equalsIgnoreCase(customerSelectedproduct)) {
                new WebDriverWait(driver, 20)
                        .until(ExpectedConditions.elementToBeClickable(priceWebelement));
                priceWebelement.click();
                break;
            }
        }
    }}
  /*  public void selectCustomerPro(String item) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.moveToElement(link).build().perform();
        link.click();
    }
      /* for(WebElement baskets:AddToBasket){

           if (baskets.getText().equalsIgnoreCase(item)){
               new WebDriverWait(driver, 20)
                       .until(ExpectedConditions.elementToBeClickable(baskets));
               baskets.click();
               break;
           }
public void selectCustomerPro(String AddToBasket){
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Actions action=new Actions(driver) ;
    action.moveToElement(link).build().perform();
        Random random=new Random();
        int randomNumber=random.nextInt();
    AddToBasket.get(randomNumber).click();

    }
  public void selectCustomerPro(){
      AddToBasket.click();
  }

    }*/
