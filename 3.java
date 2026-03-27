package com.qdbrowserstack;
import BaseDriver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FailedTest extends DriverSetup {

    @Test
    public void failedTest() throws Exception {
        driver.get("https://www.bstackdemo.com");

        // Check the title
        Assert.assertEquals(driver.getTitle(), "StackDemo");

        // Save the text of the product for later verify
        String productOnScreenText = driver.findElement(By.xpath("//*[@id=\"1\"]/p")).getText();
        // Click on add to cart button
        driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();

        // See if the cart is opened or not
        Assert.assertTrue(driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed());

        // Check the product inside the cart is same as of the main page
        String productOnCartText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")).getText();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        boolean productsMatch = productOnScreenText.equals(productOnCartText);
        if (productsMatch) {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"passed\", \"reason\": \"Product in cart matches product on main page\"}}");
        } else {
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Product in cart does not match product on main page\"}}");
        }
        Assert.assertEquals(productOnCartText, productOnScreenText);
    }
}
