package com.axis.controller

import com.axis.service.CarVariantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/car")
class CarVariantController {
    @Autowired
    var carVariantService: CarVariantService = TODO()

    @Autowired
    var carModelController: CarModelController = TODO()

    @GetMapping("/variants")
    fun getCarVariants(model: String): List<String> {
        var model_id = carModelController.getCarModelId(model)
        return carVariantService.getCarVariants(model_id)
    }

    fun getCarVariantId(variant: String): Int {
        return carVariantService.findVariantId(variant)
    }
}