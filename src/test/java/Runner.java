import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(glue = {"actions"},
                 plugin = {"pretty"},
                 features = {"src/test/resources/features/"})
public class Runner extends AbstractTestNGCucumberTests {
}



