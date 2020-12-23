package com.axis.service.impl

import com.axis.model.CarModel
import com.axis.repo.CarModelRepo
import com.axis.service.CarModelService
import org.springframework.beans.factory.annotation.Autowired

class CarModelServiceImpl: CarModelService {

    @Autowired
    var carModelRepo: CarModelRepo = TODO()

    override fun getCarModels(brand_id: Int): List<String> {
        return carModelRepo.findAllModelsForBrandId(brand_id)
    }

    override fun findModelId(model: String): Int {
        return carModelRepo.findModelId(model)
    }
}