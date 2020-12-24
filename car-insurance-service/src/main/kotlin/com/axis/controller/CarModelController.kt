package com.axis.controller

import com.axis.service.CarModelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/car")
class CarModelController {

    @Autowired
    var carModelService: CarModelService = TODO()

    @Autowired
    var carBrandController: CarBrandController = TODO()

    @GetMapping("/models")
    fun getCarModels(brand_id: Int): List<String> {
        //var brand_id = carBrandController.getCarBrandId(brand)
        return carModelService.getCarModels(brand_id)
    }

    fun getCarModelId(model: String): Int {
        return carModelService.findModelId(model)
    }
}