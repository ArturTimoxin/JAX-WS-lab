/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicepack;
import javax.jws.WebService;
@WebService(endpointInterface = "servicepack.Var2Interface")
public class Var2SimpleService implements Var2Interface {
    
    private static final int max = 10;
    
    @Override
    public String method21(String s21) {
        StringBuilder buffer = new StringBuilder(s21);
        buffer.reverse();
        String result = buffer.toString();
        return result;
    }
    
    @Override
    public boolean method22(String s22) {
        int startResult = Character.getNumericValue(s22.charAt(0)) +  Character.getNumericValue(s22.charAt(1));
        int lengthString = s22.length();
        int endResult = Character.getNumericValue(s22.charAt(lengthString - 1)) +  Character.getNumericValue(s22.charAt(lengthString - 2));
        if(startResult == endResult) return true;
        return false;
    }
    
    @Override
    public String method23(String s23) {
        
        StringBuilder strBuffer = new StringBuilder("");
        
        for(int i = 0; i < s23.length(); i++) {
            
            if(s23.charAt(i) == '1') {
                if(i == s23.length() - 1) {
                    strBuffer.append(s23.charAt(i));
                    break;
                }
                if(s23.charAt(i + 1) == '2') {
                    strBuffer.append("(12)");
                    i++;
                    continue;
                }
            }
            strBuffer.append(s23.charAt(i));
        }
        return strBuffer.toString();
    }
    
}
