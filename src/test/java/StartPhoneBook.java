import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class StartPhoneBook {

    WebDriver wd;

    @Test
    public void startPhoneBook() {
        wd = new ChromeDriver();

        //System.setProperty("webdriver.chrome.driver", "path");
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login"); //open

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");  //open www+ history
        wd.manage().window().maximize();

        // steps of test login Succes:
        // open login form ....find loginbtn + click

        //WebElement el = wd.findElement(By.id("idel"));
        // List<WebElement> list = wd.findElements(By.id("idel"));
        //WebElement a  = wd.findElement(By.tagName("a"));---->Home
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();


        WebElement element1 = wd.findElement(By.className("container"));
        // fill email.....,find email element + click + clear + type email
        //fill password....fine password element + click + clear + type password
        //click login  btn...find login btn element + click


        // Assert


        // wd.close();
        //wd.quit();
    }

    @Test
    public void home() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/Login");
        wd.manage().window().maximize();

        WebElement el = wd.findElement(By.tagName("head"));
        WebElement el1 = wd.findElement(By.tagName("meta"));
        WebElement el2 = wd.findElement(By.tagName("link"));
        WebElement el3 = wd.findElement(By.tagName("body"));
        WebElement el4 = wd.findElement(By.tagName("div"));
        WebElement el5 = wd.findElement(By.tagName("h1"));
        WebElement el6 = wd.findElement(By.tagName("input"));
        WebElement el7 = wd.findElement(By.tagName("button"));
        WebElement el8 = wd.findElement(By.tagName("a"));

        WebElement el9 = wd.findElement(By.id("root"));

        WebElement el10 = wd.findElement(By.className("container"));
        WebElement el11 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el12 = wd.findElement(By.className("active"));
        WebElement el13 = wd.findElement(By.className("login_login__3EHKB"));

        WebElement el 14 = wd.findElement(By.linkText("Home"));
        WebElement el 14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el 14 = wd.findElement(By.linkText("LOGIN"));
        WebElement el 14 = wd.findElement(By.linkText("HO"));
    }

    @Test
    public void cssLocatorsTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/Login");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));
        //by tag name
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        //by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        //отрибут
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        wd.findElement(By.cssSelector("[placeholder $='rd']"));


        wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));




    }
}