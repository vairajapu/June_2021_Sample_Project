import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ProgramUsingSikuliAPI {

	public static void main(String[] args) throws FindFailed {
		Screen screen=new Screen();
		
		Pattern Img1=new Pattern("C:\\01_Aug_2020\\Sikuli1.PNG");
		
		Pattern Img2=new Pattern("C:\\01_Aug_2020\\Sikuli2.PNG");
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\LatestChromeDriverExe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.zamzar.com/");
			  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
		//Xpath of 'Add Files' button
		driver.findElement(By.xpath("//*[@id='uploader-tool-step-1']/div/div/p[1]/button")).click();
		
		screen.wait(Img1,20);
		
		screen.type(Img1, "C:\\Screenshots\\errorscreenshot.jpg");
		
		screen.click(Img2);
		


	}

}
