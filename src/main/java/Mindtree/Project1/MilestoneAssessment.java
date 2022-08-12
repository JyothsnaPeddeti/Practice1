package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MilestoneAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[25]/a")).click();
		Actions action=new Actions(driver);
		WebElement webdriver=driver.findElement(By.className("figure"));
		action.moveToElement(webdriver).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Inputs")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/input")).sendKeys("1234");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Dropdown")).click();
		driver.findElement(By.xpath("//*[@id=\'dropdown\']")).click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("File Upload")).click();
		//driver.findElement(By.id("file-upload")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\'table1\']/tbody/tr[4]/td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'table1\']/tbody/tr[4]/td[5]")).getText());
		driver.navigate().back();
		driver.findElement(By.linkText("Key Presses")).click();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Multiple Windows")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/div/a")));
		driver.navigate().back();
		driver.findElement(By.linkText("Context Menu")).click();

	}

}
