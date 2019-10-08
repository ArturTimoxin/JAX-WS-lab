package SimpleServiceTests;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import servicepack.Var2SimpleService;
 
@RunWith(Parameterized.class)
public class Method2Test {
    
    private String parameter1;
    private boolean expectedBool;
    private Var2SimpleService var2ServieObj;
    
    public Method2Test (String parameter1, boolean expectedBool) {
        this.parameter1 = parameter1;
        this.expectedBool = expectedBool;
        this.var2ServieObj = new Var2SimpleService();
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
          {"146632", true},
          {"5698355353592", true},
          {"6221343544", true},
          {"3247782347", false},
          {"32674662348763467824", false},
       });
    }
    
    @Test
    public void method2Test() {
        assertEquals(var2ServieObj.method22(parameter1), expectedBool);
    }
}
