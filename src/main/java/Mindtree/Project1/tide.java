package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tide {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'lilo3746-wrapper\']/div/a")).click();
		Actions action=new Actions(driver);
		WebElement webdriver=driver.findElement(By.linkText("Shop Products"));
		action.moveToElement(webdriver).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Liquid")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ps-button-label")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/span/svg/path")).click();
		//driver.navigate().back();
	}

}