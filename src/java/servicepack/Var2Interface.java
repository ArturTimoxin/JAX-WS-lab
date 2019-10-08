/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicepack;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam;

@WebService public interface Var2Interface {
    @WebMethod (operationName = "methodVar2a")
        @WebResult(name = "method21Result") public String method21(@WebParam(name = "method21ParamString") String s21);
    @WebMethod (operationName = "methodVar2b") 
        @WebResult(name = "method22Result") public boolean method22(@WebParam(name = "method22ParamBool") String s22);
    @WebMethod (operationName = "methodVar2c")  
        @WebResult(name = "method23Result") public String method23(@WebParam(name = "method23ParamString") String s23);
}
