package swvlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage

{
	public void LoginPage(LoginPage obj) {
		// do something to obj
	}

	public static WebElement getTitle(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/title_tv"));

	}

	public static WebElement getskip(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/skip_btn"));

	}

	public static WebElement getloginNum(final AndroidDriver driver) {

		return driver.findElement(By.id("io.swvl.customer:id/hint"));
	}

	public static WebElement getPhoneNo(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/phone_edit_text"));
	}

	public static WebElement getLoginButton(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/next_btn"));
	}

	public static WebElement getPassword(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/password_edit_text"));
	}

}
