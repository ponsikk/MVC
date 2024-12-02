package web.service;

import org.springframework.stereotype.Service;
import web.rep.CarServiceRep;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarServiceRep {

    private final List<String> carList = new ArrayList<>();

    public CarService() {
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Ford");
        carList.add("Honda");
        carList.add("Mercedes");
    }
    public List<String> getCarsWithLimit(Integer count) {
        int limit = (count != null) ? count : Integer.MAX_VALUE;

        if (count >= carList.size() || count <= 0) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
