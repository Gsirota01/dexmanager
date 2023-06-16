package actions;

import io.cucumber.java.en.*;
import org.testng.Assert;

import java.io.IOException;
import static com.codeborne.selenide.Selenide.*;
import static pages.HomePage.*;
import static utils.Props.getPropertie;

public class DexManagerHomeActions {
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

        Assert.assertEquals(challengeQALogo().getText(),"CHALLENGE QA");
        closeWebDriver();
    }
}
