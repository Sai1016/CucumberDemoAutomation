package PageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoPageClass {
    WebDriver driver;

    public DemoPageClass(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    WebElement FName;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    WebElement LName;
    @FindBy(xpath  ="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
    WebElement Address;
    @FindBy(xpath = "//input[@type = \"email\"]")
    WebElement Email;
    @FindBy(xpath = "//input[@type = \"tel\"]")
    WebElement phone;
    @FindBy(xpath = "//label[contains(text(),\"Gender*\")]")
    WebElement Gender;
    @FindBy(xpath = "//input[@type = \"radio\"and @value=\"Male\"]")
    WebElement Male;
    @FindBy(xpath = "//input[@type = \"radio\"and @value=\"FeMale\"]")
    WebElement Female;
    @FindBy(xpath = "//input[@type = \"checkbox\"and @id = \"checkbox1\"]")
    WebElement HCricket;
    Select lang = new Select(driver.findElement(By.xpath("\"//div[@id = \\\"msdd\\\"]\"")));
    Select drop = new Select(driver.findElement(By.xpath("/select[@id = \"Skills\"]")));
    Select country = new Select(driver.findElement(By.xpath("//select[@id = \"countries\"]")));
    Select year = new Select(driver.findElement(By.xpath("//select[@id = \"yearbox\"]")));
    Select month = new Select(driver.findElement(By.xpath("//select[@placeholder = \"Month\"]")));
    Select day = new Select(driver.findElement(By.xpath("//select[@placeholder = \"Day\"]")));
    @FindBy(xpath = "//input[@id=\"firstpassword\"]")
    WebElement pwd;
    @FindBy(xpath = "//input[@id=\"secondpassword\"]")
    WebElement ConfirmPwd;
    @FindBy(xpath = "//button[@id=\"submitbtn\"]")
    WebElement submit;

    public void VerifyFname(String fn) {
        FName.sendKeys(fn);
        FName.click();
    }

    public void VerifyLName(String ln) {
        LName.sendKeys(ln);
        LName.click();
    }

    public void VerifyLAddress(String add) {
        Address.sendKeys(add);
        Address.click();
    }
    public void VerifyLEmail(String em) {
        Email.sendKeys(em);
        Email.click();
    }
    public void VerifyLPhone(String ph) {
        phone.sendKeys(ph);
       phone.click();
    }
    public void VerifyGender(String Gender){
        if(Gender.equals("Male")){
            Male.click();
        }
        else{
            Female.click();
        }
    }
    public void VerifyCricket(String string){
        HCricket.click();
    }
    public void VerifyLang(){
        lang.deselectByVisibleText("English");
    }
    public void Verifydrop(){
        drop.selectByValue("Analytics");
    }
    public void VerifyCounty(){
        country.selectByIndex(5);
    }
    public void  VerifyDOB(){
        year.selectByValue("1990");
        month.selectByValue("October");
        day.selectByValue("5");
    }
    public void Verifypwd(String pass){
        pwd.sendKeys(pass);
        pwd.click();
    }
    public void VerifyCpwd(String Cpass){
        ConfirmPwd.sendKeys(Cpass);
        ConfirmPwd.click();
    }
    public void VerifySignin(){
        submit.click();
    }
}