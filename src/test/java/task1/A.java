
package task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Desktop\\Clonned Project 2\\GitDay1Task1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("do again");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();
		driver.close();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		System.out.println("guruprasad");
		
	}
}