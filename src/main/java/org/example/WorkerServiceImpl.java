package org.example;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.example.WorkerService")
public class WorkerServiceImpl implements WorkerService {
    @Override
    public List<Worker> getWorkers() {
        // Sample data
        Tasks tasks1 = new Tasks("Programavimas");
        Tasks tasks2 = new Tasks("Vadyba");
        Tasks tasks3 = new Tasks("Geometrija");

        Worker worker1 = new Worker("Jonas", 25, Arrays.asList(tasks1, tasks2));
        Worker worker2 = new Worker("Petras", 22, Arrays.asList(tasks1));
        Worker worker3 = new Worker("Greta", 19, Arrays.asList(tasks3, tasks1, tasks2));

        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        return workers;
    }
}
