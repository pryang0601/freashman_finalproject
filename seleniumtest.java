package final_project;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class seleniumtest {
	private static ArrayList temperature=new ArrayList<>();
	private static ArrayList city=new ArrayList<>();
	private static ArrayList weather=new ArrayList<>();
	 public void get(){
	  //自己選擇要用的瀏覽器 WebDriver
	  //用Chrome
	  System.setProperty("webdriver.chrome.driver","/Users/pryang/Downloads/chromedriver");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  WebDriver driver = new ChromeDriver(options);
	  //使用implicitlyWait，抓取DOM時，會等DOM出現才抓，最多等10秒
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.cwb.gov.tw/V8/C/W/OBS_Map.html"); 
	  List<WebElement> searchInput = driver.findElements(By.cssSelector("#\\# > span > span >i"));//抓溫度
	  List<WebElement> searchInput2 = driver.findElements(By.cssSelector("span.city"));//抓縣市
	  List <WebElement>searchInput3 = driver.findElements(By.cssSelector("span.weather>img"));//By.cssSelector("span.weather>img")//"*[@id=\"#\"]/img"
	   for (WebElement ele:searchInput) {
		  temperature.add(ele.getText());
	   }
	   for (WebElement ele:searchInput2) {
		  city.add(ele.getText());
	   }
	  for (WebElement ele:searchInput3) {
		  weather.add(ele.getAttribute("alt"));
	   }
	  driver.quit(); //關閉瀏覽器
	 }
	 public ArrayList<Integer> get_tem() {
		 return temperature;
	 }
	 public static ArrayList get_city() {
		 return city;
	 }
	 public static ArrayList get_weather() {
		 return weather;
	 }
}