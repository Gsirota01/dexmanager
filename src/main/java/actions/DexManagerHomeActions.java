package actions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static pages.HomePage.*;
import static utils.Props.getPropertie;

public class DexManagerHomeActions {

    @BeforeAll
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }
    @Given("el sitio de DexManager")
    public void visitDexManager(){
        String url = getPropertie("dexManager","URL");
        open(url);
    }
    @When("el usuario se loguea")
    public void completeLogin() throws InterruptedException {
        String user = getPropertie("dexManager","USER");
        String password = getPropertie("dexManager","PASSWORD");
        Thread.sleep(10000);

        usernameInput().sendKeys(user);
        passwordInput().sendKeys(password);
        botonLogin().click();
        Thread.sleep(10000);
    }
    @Then("se valida la pagina de inicio")
    public void validateHomePage(){

        Assert.assertEquals(challengeQALogo().getText(),"ARG - CHALLENGE QA");
        closeWebDriver();
    }
}
