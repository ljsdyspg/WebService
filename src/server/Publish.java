package server;

import javax.xml.ws.Endpoint;

public class Publish {
    public static void main(String[] args) {
        Object implementor = new HelloWorldImpl();
        String address = "http://localhost:8080/HelloWorld";
        Endpoint.publish(address,implementor);
        System.out.println("Publish Successfully!");
    }
}
