import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(glue = {"actions"},
                 plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
                 features = {"src/test/resources/features/"})
public class Runner extends AbstractTestNGCucumberTests {
}



