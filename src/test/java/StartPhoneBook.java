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

        //System.setProperty("webdriver.chrome.d  river", "path");

        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");// open
        wd.navigate().to(" https://contacts-app.tobbymarshall815.vercel.app/");// open www + history
        wd.manage().window().maximize();


        // steps of test login Success:
        // open login form  --- find loginbtn + click  --> opened form login


        // WebElement el = wd.findElement(By.id("idel"));
        // List<WebElement> list = wd.findElements(By.id("idel"));
        //WebElement a = wd.findElement(By.tagName("a")); --- > HOME
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("container"));

        // fill email   --- find email element+ click+clear+type email
        //fill password ---  find password element+ click+clear+type password
        //click login btn  find login btn element+ click


        // Assert

        // wd.close(); // close one tab
        // wd.quit(); // close all tabs

    }


    @Test
    public void home() {
        wd = new ChromeDriver();
        wd.navigate().to(" https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        // wd.findElement(By.tagName());

        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement el7 = wd.findElement(By.tagName("a"));
        WebElement el4 = wd.findElement(By.tagName("input"));
        WebElement el5 = wd.findElement(By.tagName("br"));
        WebElement el6 = wd.findElement(By.tagName("button"));


        // wd.findElement(By.id());
        WebElement el8 = wd.findElement(By.id("root"));
        // By.className
        WebElement el9 = wd.findElement(By.className("container"));
        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.className("active"));
        WebElement el12 = wd.findElement(By.className("login_login__3EHKB"));


        // byLinkText /// HOME,ABOUT,LOGIN,FVMLFBM,EEE,22R,DFG,GHH,FGHH,THH
        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
        WebElement el16 = wd.findElement(By.partialLinkText("HO"));

    }


    @Test
    public void cssLocatorsTest() {
        wd = new ChromeDriver();
        wd.navigate().to(" https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        //wd.findElement(By.cssSelector(""));
        // by tag name
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a")); //   /html/body/div/div/a

        // by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));
        // атрибут
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.xpath("//*[@placeholder]"));

        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.xpath("//*[@placeholder ='Password']"));

        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));

        wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pa')]"));

        wd.findElement(By.cssSelector("[placeholder $='rd']"));


    }
}