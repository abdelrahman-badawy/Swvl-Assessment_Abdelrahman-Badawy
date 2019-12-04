package swvlElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AfterLogin {

	public void AfterLogin(AfterLogin obj) {
		// do something to obj
	}

	public static WebElement getCoachMarks(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/where_to_coach_marks"));
	}

	public static WebElement getSearch(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/where_to"));

	}

	public static WebElement getWriteDestination(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/dropoff_et"));

	}

	public static WebElement getChooseDest(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/where_to"));

	}

	public static WebElement getEnterExactDest(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text='Ezbet Nafie, El-Basatin, Egypt']"));

	}

	public static WebElement getchoosedate(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.Button[@text='Fri']"));

	}

	public static WebElement getchooseTrip(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text='F287']"));

	}

	public static WebElement getBookBtn(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/book_btn"));

	}

	public static WebElement getDoneBtn(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/done_btn"));

	}

	public static WebElement getMenue(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/menu_iv"));

	}

	public static WebElement getYourTrips(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Your Trips']"));

	}

	public static WebElement getCardRideView(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/ride_card_view"));

	}

	public static WebElement getCancelBtn(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/cancel_booking_iv"));

	}

	public static WebElement getConfirmCancelBtn(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/confirm_btn"));

	}

	public static WebElement getCanceletionReason(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text='The timing was not suitable']"));

	}

	public static WebElement getCaptainlayout(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/captain_layout"));

	}

	public static WebElement geToolbar(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/toolbar"));

	}

	public static WebElement getWritePickup(final AndroidDriver driver) {
		return driver.findElement(By.id("io.swvl.customer:id/pickup_et"));

	}

	public static WebElement getChoosePickup(final AndroidDriver driver) {
		return driver.findElement(By.xpath("//android.widget.TextView[@text='Vodafone Smart Village C2 Parking']"));

	}
}
