package org.example;

import javax.xml.ws.Endpoint;

public class WorkerServiceServeris {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/worker", new WorkerServiceImpl());
        System.out.println("Service is published at http://localhost:8080/ws/worker?wsdl");
    }
}
