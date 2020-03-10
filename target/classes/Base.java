package Resource;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	 public Properties Prop;
	public WebDriver intializeDriver() throws IOException{
		
		
	 Prop = new Properties();
	//FileInputStream fis  =new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\Resource\\data.properties");
    //FileInputStream fis  =new FileInputStream("C:\\Users\\Shraddha\\E2EProject\\src\\main\\java\\Resource\\data.properties");
	FileInputStream fis  =new FileInputStream("C:\\Users\\Shraddha\\E2EProject\\src\\main\\java\\Resource\\data.properties");
	Prop.load(fis);
	
	//if you are taking browser name from prop folder 
	String BrowserName = Prop.getProperty("browser");
	
	//else from maven folder
	//String BrowserName =System.getProperty("browser");
	System.out.println(BrowserName);
	//when running headless make sure it is 
	if (BrowserName.contains("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
     if (BrowserName.contains("headless"))
		{
    	 option.addArguments("headless");
	
		}
     		driver = new ChromeDriver(option);
	  }
	else if(BrowserName.equals("firefox"))
	 {
		
	 }
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		return driver;
	}

	public void getScreenShot(String resul) throws IOException   
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //common ios 
		//import org.apache.commons.io.FileUtils;this is needed for that i have added dependency in maven
		FileUtils.copyFile(src,new File ("C:\\Users\\Shraddha\\images\\" + resul + "screenshot.png"));
	}
}
