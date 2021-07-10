import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver ();

        chromedriver.get("https://www.sharelane.com/cgi-bin/main.py");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")).click();
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
        Thread.sleep(5000);
        chromedriver.finElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).click();
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("Mik");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Rico");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("j8990099@gmail.com");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")).sendKeys("12345678");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")).sendKeys("12345678");
        Thread.sleep(5000);
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")).click();
        Thread.sleep(5000);
        chromedriver.close();
        chromedriver.guit();

    }
}
