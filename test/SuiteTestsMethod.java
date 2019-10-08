import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import SimpleServiceTests.Method1Test;
import SimpleServiceTests.Method2Test;
import SimpleServiceTests.Method3Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
 Method1Test.class,
 Method2Test.class,
 Method3Test.class,
})
public class SuiteTestsMethod{}
