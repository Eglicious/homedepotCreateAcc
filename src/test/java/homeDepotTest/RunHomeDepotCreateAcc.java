package homeDepotTest;

import homeDepotPF.BeginHomeDepotCreateAcc;
import homeDepotPF.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunHomeDepotCreateAcc {

    WebDriver driver;
    @Parameters({"browser", "url", "email","pass","zip","phone"})
    @Test
    void create(String browsers, String urls, String emails, String password, String zipcode, String phones) {
        driver = BrowserFactory.openbrowser(browsers, urls);
        BeginHomeDepotCreateAcc execute = PageFactory.initElements(driver, BeginHomeDepotCreateAcc.class);
        execute.createAcc(emails,password,zipcode,phones);


    }

    @AfterSuite
    void terminate(){
        driver.close();

    }

//    @Test
//    void create() {
//        WebDriver driver = BrowserFactory.openbrowser("chrome", "http://www.homedepot.com");
//        BeginHomeDepotCreateAcc execute = PageFactory.initElements(driver, BeginHomeDepotCreateAcc.class);
//        execute.createAcc("useroneema@gmail.com","newpassidse1","20009","3011232345");
//
//
//    }
}
