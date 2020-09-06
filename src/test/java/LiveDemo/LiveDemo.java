package LiveDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo {

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        WebDriverManager.chromedriver().arch64().setup();
        WebDriver driver=new ChromeDriver();

        //driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
        driver.get("https://letskodeit.teachable.com/p/practice");

        driver.findElement(By.xpath("//tr//th[1]")).click();

        List<WebElement> orginallist=driver.findElements(By.xpath("//tr/td[1]"));
        // s is variable taking the first webelement
        List<String> originalTextList=orginallist.stream().map(s->s.getText()).collect(Collectors.toList());
        System.out.print("originaltextlis"+originalTextList + "\n");
        //[a,d,d]
        //[a,b,d]
        // text of all rows
        // sort on list

        List<String> sortedList=originalTextList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originalTextList.equals(sortedList));

        System.out.println("sorted"+sortedList);


        driver.close();








    }
}
