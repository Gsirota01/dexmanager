package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static WebElement usernameInput() {
        return $(By.tagName("dex-app"))
                .getShadowRoot().findElement(new By.ByCssSelector("iron-pages"))
                .findElement(By.cssSelector("dex-login"))
                .getShadowRoot().findElement(new By.ByCssSelector("paper-input[id='username']"))
                .getShadowRoot().findElement(new By.ByCssSelector("paper-input-container"))
                .findElement(new By.ByCssSelector("iron-input input"));
    }

    public static WebElement passwordInput(){
        return $(By.tagName("dex-app"))
                .getShadowRoot().findElement(new By.ByCssSelector("iron-pages"))
                .findElement(By.cssSelector("dex-login"))
                .getShadowRoot().findElement(new By.ByCssSelector("paper-input[id='password']"))
                .getShadowRoot().findElement(new By.ByCssSelector("paper-input-container"))
                .findElement(new By.ByCssSelector("iron-input input"));
    }

    public static WebElement botonLogin(){
        return $(By.tagName("dex-app"))
                .getShadowRoot().findElement(new By.ByCssSelector("iron-pages"))
                .findElement(By.cssSelector("dex-login"))
                .getShadowRoot().findElement(new By.ByCssSelector("paper-button"));
    }

    public static WebElement challengeQALogo(){
        return $(By.tagName("dex-app"))
                .getShadowRoot().findElement(new By.ByCssSelector("iron-pages"))
                .findElement(By.cssSelector("dex-master"))
                .getShadowRoot().findElement(By.cssSelector("dex-header"))
                .getShadowRoot().findElement(By.cssSelector("app-header"))
                .findElement(By.cssSelector("app-toolbar"))
                .findElement(By.cssSelector("span[id='customerTitle']"));
    }


}
