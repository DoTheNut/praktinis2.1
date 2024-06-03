package org.example;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.List;

public class WorkerServiceClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/ws/worker?wsdl");
        QName qname = new QName("http://example.org/", "WorkerServiceImplService");

        Service service = Service.create(wsdlURL, qname);
        WorkerService workerService = service.getPort(WorkerService.class);

        List<Worker> workers = workerService.getWorkers();
        for (Worker worker : workers) {
            System.out.println("Name: " + worker.getName() + ", Age: " + worker.getAge());
            for (Tasks tasks : worker.getSubjects()) {
                System.out.println("  Subject: " + tasks.getName());
            }
        }
    }
}
