package com.axis.service.impl

import com.axis.model.CarBrand
import com.axis.repo.BrandRepo
import com.axis.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired

class VehicleServiceImpl: VehicleService {

    @Autowired
    var brandRepo: BrandRepo = TODO()

    override fun getCarBrands(): List<CarBrand> {
        return brandRepo.findAll()
    }
}