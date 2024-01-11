package net.com.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {

    @WebMethod
    public String bonjour(String name) {
        return String.format("Bonjour %s", name);
    }

    @WebMethod
    public String getShopInfo (String property){
        String response = "invalid property";
        if("shopname".equals(property)){
            return "Spring Shop Name";
        } else if ("since".equals(property)) {
            return "1998";
        }
        return response;
    }
}
