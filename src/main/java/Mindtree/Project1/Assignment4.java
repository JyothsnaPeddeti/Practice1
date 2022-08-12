package Mindtree.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
		driver.findElement(By.xpath("//*[@class='a-button-inner']")).click();
		System.out.println(driver.findElement(By.className("a size large product title word break")).getText());
		System.out.println(driver.findElement(By.tagName("a")));
	}

}
