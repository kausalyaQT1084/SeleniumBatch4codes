package org.seleniumbatch4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class XpathFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
		driver.get("https://linkedin.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("session_key")).sendKeys("kausalya24@gmail.com");
	    driver.findElement(By.name("session_password")).sendKeys("Ilove@2010");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    

	}

}
