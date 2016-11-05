import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {

  public static void main(String[] args) throws InterruptedException {
	  int a=10;
	  //Data Type Variable Name = Value;
      FirefoxDriver dr = new FirefoxDriver();
      dr.get("http://www.facebook.com");
      dr.findElement(By.xpath("   ")).sendKeys("Bittech");
      dr.findElement(By.id("")).click();
      Thread.sleep(500);
      dr.quit();
	}

}
