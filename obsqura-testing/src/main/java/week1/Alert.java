package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert alert=new Alert();
		alert.browserInit();
		alert.alertFunction();
	}
	public void alertFunction() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMe.click();
		driver.switchTo().alert().accept();
		
		WebElement yellowClickMe= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		yellowClickMe.click();
		driver.switchTo().alert().dismiss();
		

		WebElement prompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Hi");
		driver.switchTo().alert().accept();
		
	}

}
