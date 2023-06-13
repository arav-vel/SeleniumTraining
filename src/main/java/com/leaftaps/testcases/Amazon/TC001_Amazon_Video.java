package com.leaftaps.testcases.Amazon;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC001_Amazon_Video {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String window:windowHandles) {
			driver.switchTo().window(window);
		}
		
		System.out.println("Window Title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//div[@id='altImages']/ul/li[contains(@data-csa-c-action,'Video')]/descendant::input")).click();
		
		String time = driver.findElement(By.xpath("//span[contains(text(),'Remaining Time')]/following-sibling::span[@role]")).getText();
		int seconds = Integer.parseInt(time.substring(time.length()-2));
		int minutes = Integer.parseInt(time.substring(0, 1));
		
		int videoTimer = (minutes*60)+seconds;
		
		System.out.println("Time: "+videoTimer);
		
		Thread.sleep(videoTimer*1000);
		
		
		driver.findElement(By.xpath("//button[@data-action='a-popover-close']")).click();
		
		Thread.sleep(5000);

		driver.quit();
	}

}
