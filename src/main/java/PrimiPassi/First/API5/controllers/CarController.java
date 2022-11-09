package PrimiPassi.First.API5.controllers;

import PrimiPassi.First.API5.DTO.CarDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping()
    public CarDTO getNewCar(){
        return new CarDTO("5","Alfa Romeo MiTo",5000);
    }
    @PostMapping()
    public String carBody(@Validated @RequestBody CarDTO carDTO){
        return carDTO.toString();
    }
}
