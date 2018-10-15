package client.test;

import client.HelloWorldImpl;
import client.HelloWorldImplService;

public class Client {
    public static void main(String[] args) {
        HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
        HelloWorldImpl helloWorld = helloWorldImplService.getHelloWorldImplPort();
        String returnStr = helloWorld.sayHello("Mr.Test");
        System.out.println(returnStr);
    }
}
