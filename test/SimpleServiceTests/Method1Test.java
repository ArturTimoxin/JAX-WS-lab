/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleServiceTests;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import servicepack.Var2SimpleService;
 
/**
 *
 * @author Xiaomi
 */
@RunWith(Parameterized.class)
public class Method1Test {
    
    private String parameter1;
    private String expectedString;
    private Var2SimpleService var2ServieObj;
    
    public Method1Test (String parameter1, String expectedString) {
        this.parameter1 = parameter1;
        this.expectedString = expectedString;
        this.var2ServieObj = new Var2SimpleService();
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
          {"mother", "rehtom"},
          {"apple", "elppa"},
          {"level", "level"},
          {"noon", "noon"},
          {"refer", "refer"},
       });
    }
    
    @Test
    public void method1Test() {
        assertEquals(var2ServieObj.method21(parameter1), expectedString);
    }
}
