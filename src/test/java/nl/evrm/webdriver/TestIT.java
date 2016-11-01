package nl.evrm.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.File;

import java.io.IOException;

public class TestIT {
  private static final String WEBPAGE = "https://apex.oracle.com/pls/apex/f?p=92029";
  private static final String TITLE = "jQuery Mobile - Log In";
  private WebDriver driver;

  @BeforeSuite
  public void creatDriver(){
    this.driver= new HtmlUnitDriver(true);
  }

  @Test
  public void getLoginPageWithHTMLUNIT() throws IOException, InterruptedException {
      driver.get(WEBPAGE);
      System.out.println("TITLE IS ==>\""+driver.getTitle()+"\"");
    Assert.assertEquals(driver.getTitle(), TITLE);
  }

  @AfterSuite
  public void closeDriver(){
    driver.close();
  }
}
