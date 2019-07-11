package homeDepotPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BeginHomeDepotCreateAcc {

    WebDriver driver;

    @FindBy(how = How.ID, using = "headerMyAccountTitle")
    WebElement myAccountLink;

    @FindBy(how = How.LINK_TEXT, using = "Register")
    WebElement registerLink;


    @FindBy(how = How.XPATH, using = "//input[@class=\"form-input__field invalid\"][@id=\"email_id\"]")
    WebElement emailInputLable;

    @FindBy(how = How.ID, using = "registrationPassword")
    WebElement passwordInputLable;

    @FindBy(how = How.ID, using = "zipcode")
    WebElement zipcodeInputLable;

    @FindBy(how = How.ID, using = "phoneNumber")
    WebElement phoneNumberInputLable;

    @FindBy(how = How.ID, using = "accountRegister")
    WebElement createAccountButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[19]/div[2]/button")
    WebElement clsoseBoxButton;




    public BeginHomeDepotCreateAcc(WebDriver driver){
        this.driver=driver;
    }

    public void createAcc(String inputEmail, String inputPassword, String inputZipcode, String inputPhonenumber ){

        myAccountLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registerLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // emailInputLable.click();
        emailInputLable.sendKeys(inputEmail);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //passwordInputLable.click();
        passwordInputLable.sendKeys(inputPassword);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // zipcodeInputLable.click();
        zipcodeInputLable.sendKeys(inputZipcode);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  phoneNumberInputLable.click();
        phoneNumberInputLable.sendKeys(inputPhonenumber);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createAccountButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  driver.switchTo().alert().accept();

        clsoseBoxButton.click();

    }
}
