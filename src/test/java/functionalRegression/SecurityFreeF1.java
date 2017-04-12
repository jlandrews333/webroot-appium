package functionalRegression;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SecurityFreeF1 {
	
	@SuppressWarnings("rawtypes")
	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//Configure for connection to the device thru Appium Server
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("deviceName","SM-900V");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","5.0");
		capabilities.setCapability("app", "C:\\Users\\jandr\\OneDrive - Webroot\\Webroot\\Automation\\Appium\\SME and MPC APKs\\consumer-free-release.apk");
		capabilities.setCapability("appPackage", "com.webroot.security");
		capabilities.setCapability("appActivity", "com.webroot.security.MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//@When //Select the Agree and Launch button
		Thread.sleep(8000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.webroot.security:id/agree_button\")").click();
		
		//@Then //Activate with a BETA Key
		Thread.sleep(10000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.webroot.security:id/activate_button\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.webroot.security:id/keyCode\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.webroot.security:id/keyCode\")").sendKeys("SA5A-TEST-4D2C-BCA7-B5BE");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.webroot.security:id/keyCodeOK\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")").click();
	}


}
