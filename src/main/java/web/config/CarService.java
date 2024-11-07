package web.config;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<String> carList = new ArrayList<>();

    public CarService() {
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Ford");
        carList.add("Honda");
        carList.add("Mercedes");
    }
    public List<String> getCarList(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
