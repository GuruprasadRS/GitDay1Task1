package task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Maven-Workspace\\GitDay1Task1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.quit();
}
}
