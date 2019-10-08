package SimpleServiceTests;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import servicepack.Var2SimpleService;
 
@RunWith(Parameterized.class)
public class Method3Test {
    
    private String parameter1;
    private String expectedString;
    private Var2SimpleService var2ServieObj;
    
    public Method3Test (String parameter1, String expectedString) {
        this.parameter1 = parameter1;
        this.expectedString = expectedString;
        this.var2ServieObj = new Var2SimpleService();
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
          {"651258", "65(12)58"},
          {"5612355312592", "56(12)3553(12)592"},
          {"6221343544", "6221343544"},
          {"121212", "(12)(12)(12)"},
          {"1212121", "(12)(12)(12)1"},
          {"1121212", "1(12)(12)(12)"},
          {"11212122", "1(12)(12)(12)2"},
       });
    }
    
    @Test
    public void method3Test() {
        assertEquals(var2ServieObj.method23(parameter1), expectedString);
    }
}
