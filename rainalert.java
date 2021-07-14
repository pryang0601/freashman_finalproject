package final_project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class rainalert {
	public void get_rainalert(String al){
		System.setProperty("webdriver.chrome.driver","/Users/pryang/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
	    WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cwb.gov.tw/V8/C/P/Warning/W33.html"); 
		WebElement alert =driver.findElement(By.className("icon-list"));
		//System.out.println(alert.getText());
		final_project.rainalert=alert.getText();
		al=alert.getText();
		driver.quit(); //關閉瀏覽器
	}
}
