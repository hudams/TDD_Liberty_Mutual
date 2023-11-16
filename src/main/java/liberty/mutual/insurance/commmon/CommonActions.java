package liberty.mutual.insurance.commmon;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import liberty.mutual.insurance.reports.Loggers;

public class CommonActions {

	public static void input(WebElement element, String inputValue) {
		try {
			element.sendKeys(inputValue);
			Loggers.log(element + " ----> Input value: " + inputValue);
		} catch (NoSuchElementException e) {
			Loggers.log(element + " ----> Not Found \n" + e.getMessage());
		}

	}
	
	public static void click(WebElement element) {
		try {
			element.click();
			Loggers.log(element + "-----> clicked ");
		} catch (NoSuchElementException e) {
			Loggers.log(element + " ----> Not Found \n" + e.getMessage());
		}

	}
}
