package exercises.chapter3.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MenuCount {

    private WebDriver driver;

    public void printLinkCount(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();


        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu elements: " + menuItems.size());

        driver.quit();
    }

    public static void main(String args[]){
        MenuCount test = new MenuCount();
        test.printLinkCount();
    }
}
