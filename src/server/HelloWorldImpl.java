package server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorldWS{
    @WebMethod

    @Override
    public String sayHello(String name) {
        String str = "Welcome, "+name+" !";
        System.out.println(str);
        return str;
    }
}
