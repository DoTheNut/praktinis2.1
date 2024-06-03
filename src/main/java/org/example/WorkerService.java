package org.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface WorkerService {
    @WebMethod
    List<Worker> getWorkers();
}
