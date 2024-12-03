package web.service;

import java.util.List;

public interface CarService {
    List<String> getCarsWithLimit(Integer count);
    List<String> getList();
}
