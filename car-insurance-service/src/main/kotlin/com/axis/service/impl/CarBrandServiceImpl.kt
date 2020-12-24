package com.axis.service.impl

import com.axis.model.CarBrand
import com.axis.repo.CarBrandRepo
import com.axis.service.CarBrandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarBrandServiceImpl: CarBrandService {

    @Autowired
    var carBrandRepo: CarBrandRepo = TODO()

    override fun getCarBrands(): List<CarBrand> {
        return carBrandRepo.findAll()
    }

    override fun getCarBrandId(brand: String): Int {
        return carBrandRepo.findCarBrandId(brand)
    }
}