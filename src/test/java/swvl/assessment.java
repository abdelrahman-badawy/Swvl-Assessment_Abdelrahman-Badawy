package swvl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class assessment {

	// static String driverPath ;
	public static AndroidDriver driver = null;
	public static WebDriverWait wait;
	public static String projectpath = null;
	public static String appPackage = null;

	@BeforeTest
	public void setUp() throws Exception {

		// Created object of DesiredCapabilities class.
		// System.out.println(app);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "8.1");
		capabilities.setCapability("deviceName", "HUAWEI LUA-U22");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("appPackage", "io.swvl.customer");
		capabilities.setCapability("appActivity", "io.swvl.customer.features.LaunchScreenActivity");
		// capabilities.setCapability("appActivity",
		// "io.swvl.customer.features.onboarding.ServiceOnBoardingActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(priority = 1, enabled = true)
	public void login() throws Exception {

		try {
			swvlElements.LoginPage.getskip(driver).click();
		} catch (Exception e) {
			System.out.println("tutorials screen didn't appear");
		}

		swvlElements.LoginPage.getloginNum(driver).click();
		swvlElements.LoginPage.getPhoneNo(driver).sendKeys("1092542541");
		swvlElements.LoginPage.getLoginButton(driver).click();
		swvlElements.LoginPage.getPassword(driver).sendKeys("01009454381Hh");
		swvlElements.LoginPage.getLoginButton(driver).click();
		Thread.sleep(4000);
	}

	@Test(priority = 2, enabled = true)
	public void reserveAtrip() throws Exception {

		swvlElements.AfterLogin.getSearch(driver).click();
		swvlElements.AfterLogin.getWritePickup(driver).sendKeys("Vodafone");
		Thread.sleep(5000);
		swvlElements.AfterLogin.getChoosePickup(driver).click();
		Thread.sleep(5000);
		swvlElements.AfterLogin.getWriteDestination(driver).sendKeys("Swvl");
		Thread.sleep(5000);
		swvlElements.AfterLogin.getEnterExactDest(driver).click();
		Thread.sleep(5000);
		swvlElements.AfterLogin.getchoosedate(driver).click();
		swvlElements.AfterLogin.getchooseTrip(driver).click();
		swvlElements.LoginPage.getLoginButton(driver).click();
		swvlElements.AfterLogin.getBookBtn(driver).click();
		swvlElements.AfterLogin.getDoneBtn(driver).click();

	}

	@Test(priority = 3, enabled = true)
	public void cancelAtrip() throws Exception {

		swvlElements.AfterLogin.getMenue(driver).click();
		swvlElements.AfterLogin.getYourTrips(driver).click();
		swvlElements.AfterLogin.getCardRideView(driver).click();
		Thread.sleep(4000);

		try {
			WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"io.swvl.customer:id/captain_layout\")).getChildByText("
							+ "new UiSelector().className(\"android.widget.TextView\"), \"Cancel Trip\")"));
		} catch (Exception e) {

		}

		swvlElements.AfterLogin.getCancelBtn(driver).click();
		swvlElements.AfterLogin.getConfirmCancelBtn(driver).click();
		swvlElements.AfterLogin.getCanceletionReason(driver).click();
		Thread.sleep(4000);

	}
}
