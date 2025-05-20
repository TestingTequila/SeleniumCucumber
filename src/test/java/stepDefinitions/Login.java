package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login
{
    WebDriver driver;
    @Given("Open the browser")
    public void open_the_browser() {
        driver = new ChromeDriver();
    }
    @Given("Enter the url")
    public void enter_the_url() {
        driver.get("https://janbaskdemo.com/");
    }
    @Given("Click on My Account icon")
    public void click_on_my_account_icon() {
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }
    @When("Click on login Link")
    public void click_on_login_link() {
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
    }
    @When("Enter correct email")
    public void enter_correct_email() {
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("jason.roger@janbask.com");
    }
    @When("Enter correct password")
    public void enter_correct_password() {
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");
    }
    @When("Click on Login button")
    public void click_on_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }
    @Then("Validate Login Status")
    public void validate_login_status() {

        String pageTitle = driver.getTitle();
        if (pageTitle.equals("My Account")) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login failed...Please check your credentials");
        }
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
