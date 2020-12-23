package com.axis.controller

import com.axis.service.CarVariantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VehicleController {

    @Autowired
    var carBrandController: CarBrandController = TODO()

    @Autowired
    var carModelController: CarModelController = TODO()

    @Autowired
    var carVariantService: CarVariantService = TODO()

    @PostMapping("/vehicle")
    fun addVehicleDetails(model: String): List<String> {
        var model_id = carModelController.getCarModelId(model)
        return carVariantService.getCarVariants(model_id)
    }
}