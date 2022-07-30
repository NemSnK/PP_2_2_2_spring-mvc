package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {
    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCar(@RequestParam(name = "count", defaultValue = "5") String count, Model model) {
        try {
            model.addAttribute("cars", carService.getCars(Integer.parseInt(count)));
        } catch (NumberFormatException e) {
            model.addAttribute("cars", carService.getCars(0));
        }
        return "cars";
    }
}
