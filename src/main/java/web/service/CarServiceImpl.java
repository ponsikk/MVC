package web.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<String> carList = new ArrayList<>();

    public CarServiceImpl() {
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

    @Override
    public List<String> getList() {
        return carList;
    }
}
