/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicepack;

import javax.xml.ws.Endpoint;

public class Var2ServicePublisher {
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:8080/Lab3_my/Va2SimpleService", new servicepack.Var2SimpleService()); 
    }
}
