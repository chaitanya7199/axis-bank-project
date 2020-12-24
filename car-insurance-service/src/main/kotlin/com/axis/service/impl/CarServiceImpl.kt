package com.axis.service.impl

import com.axis.model.Car
import com.axis.repo.CarRepo
import com.axis.service.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarServiceImpl: CarService {

    @Autowired
    var carRepo: CarRepo = TODO()

    override fun addCarDetails(car: Car) {
        carRepo.save(car)
    }
}

//ID and NAME
//BRAND
//<option value="{brandid}">{brandname}</option>