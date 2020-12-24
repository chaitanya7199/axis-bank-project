package com.axis.controller

import com.axis.model.Car
import com.axis.service.CarService
import com.axis.service.CarVariantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class CarController {

    @Autowired
    var carBrandController: CarBrandController = TODO()

    @Autowired
    var carModelController: CarModelController = TODO()

    @Autowired
    var carVariantController: CarVariantController = TODO()

    @Autowired
    var carService: CarService = TODO()

    @PostMapping("/car")
    fun addVehicleDetails(@PathVariable car: Car) {
        //var brand_id = carBrandController.getCarBrandId(brand)
        //var model_id = carModelController.getCarModelId(model)
        //var variant_id = carVariantController.getCarVariantId(variant)
        carService.addCarDetails(car)
    }
}