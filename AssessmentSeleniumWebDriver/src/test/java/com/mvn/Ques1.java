package com.mvn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class Ques1 {

	WebDriver driver = null;
	
	public void demoQA_Practice_form() throws InterruptedException, IOException {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Singh");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Barnawal");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("simmib1717@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userNumber")).sendKeys("8200577289");
		Thread.sleep(2000);
		
		JavascriptExecutor up = (JavascriptExecutor)driver;
		up.executeAsyncScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		
		WebElement WE1= driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
		WebElement WE2= driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
		Select s1= new Select(WE1);
		Select S2= new Select(WE2);
		s1.selectByVisibleText("February");
		S2.selectByValue("1996");
		Thread.sleep(2000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\admin\\Pictures\\Camera Roll\\M.jpg");
		Thread.sleep(5000);
		driver.findElement(By.id("currentAddress")).sendKeys(" 147/B, Akshar Township, Dumbhal, Surat ");
		Thread.sleep(2000);
		
		File f1 = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("F:\\Vinit\\Tops Technologies\\Assessment\\Automation Assessment\\SS\\DemoQAReg.png"));
		driver.quit();
		
		
	}
	
	
	
	
}
