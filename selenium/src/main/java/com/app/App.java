package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/intl/en-GB/account/about/");
        driver.findElement(By.xpath("/html/body/header/div[1]/div[5]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Swapnil");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Bandal");
        driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
      
      //
        
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(9);
        driver.findElement(By.xpath("*[@id=\"day\"]")).sendKeys("13");
        driver.findElement(By.xpath("*[@id=\"year\"]")).sendKeys("2001");
		Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[2]/div[1]")));
        gender.selectByIndex(1);
        driver.findElement(By.xpath("*[@id=\"birthdaygenderNext\"]/div/button/div[3]")).click();
        
        Select selection = new Select(driver.findElement(By.id("selectionc3")));
        selection.selectByIndex(1);
        
        driver.findElement(By.xpath("*[@id=\"password\"]")).sendKeys("Pass@123");
        driver.findElement(By.xpath("*[@id=\"confirmpassword\"]")).sendKeys("Pass@123");
        driver.findElement(By.xpath("//*[@id=\"collectPasswordNext\"]/div/button/span")).click();
        
        driver.findElement(By.xpath("*[@id=\"number\"]")).sendKeys("9156432568");
        driver.findElement(By.xpath("//*[@id=\"collectNumberNext\"]/div/button/span")).click();
      
    }
}
