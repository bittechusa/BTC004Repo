import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Desktop/geckodriver.exe");
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}
	void abc(WebElement ele){
		ele.click();

	}
}