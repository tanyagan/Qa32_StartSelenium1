import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
      WebDriver wd;

        @Test
        public void tableCss(){
            wd = new ChromeDriver();
            wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
            wd.manage().window().maximize();

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

            public class TableTest {

                WebDriver wd;

                @Test
                public void tableCss(){
                    wd = new ChromeDriver();
                    wd.manage().window().maximize();
                    wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

                    WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));
                }

                @Test
                public void homework(){
                    wd = new ChromeDriver();
                    wd.manage().window().maximize();
                    wd.navigate().to("file:///C:/Users/Tatiana/Downloads/index%20(1).html");

                    WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
                    WebElement item1_2 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));

                    WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
                    WebElement inputName2 = wd.findElement(By.cssSelector("[name='name']"));

                    // Russia
                    WebElement el =wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));


                    WebElement item4 = wd.findElement(By.cssSelector("#nav ul li:last-child"));
                    System.out.println(item4.getText());

                    //  WebElement but = wd.findElement(By.ByCssSelector("[.'btn']"));
                    //WebElement but = wd.findElement(By.ByCssSelector("[.'btn']"));

                    wd.findElement(By.xpath("//*[text()='Maria Anders']"));
                    wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)"));
                    wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));

                }

                @Test
                public void xPathTests(){
                    wd = new ChromeDriver();
                    wd.manage().window().maximize();
                    wd.navigate().to("file:///Users/tayahatum/Downloads/apk/index.html");

                    WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));
                    String textItem1 = item1.getText();
                    System.out.println("Text of element Item1 --->"+textItem1);
                    Assert.assertEquals(textItem1,"Item 1");



                    WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
                    String textEurope = europe.getText();
                    Assert.assertEquals(textEurope,"Europe");


                    ////////////////////////////////////////////////////////////

                    item1.click();
                    WebElement message = wd.findElement(By.xpath("//p[@class='message']"));
                    String textMessage = message.getText();
                    Assert.assertEquals(textMessage,"Clicked by Item 1");





                }




            }


        }


    }




}
