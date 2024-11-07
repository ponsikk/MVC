package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsContoller {

    private final CarService carService;

    @Autowired
    public CarsContoller(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<String> cars = (count == null) ? carService.getCarList(carService.getCarList(Integer.MAX_VALUE).size()) : carService.getCarList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
