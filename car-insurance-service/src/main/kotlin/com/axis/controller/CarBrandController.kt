package com.axis.controller

import com.axis.model.CarBrand
import com.axis.service.CarBrandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/car")
class CarBrandController {

    @Autowired
    var carBrandService: CarBrandService = TODO()

    @GetMapping("/brands")
    fun getCarBrands(): List<CarBrand> {
        return carBrandService.getCarBrands()
    }

    fun getCarBrandId(brand: String): Int {
        return carBrandService.getCarBrandId(brand)
    }

}