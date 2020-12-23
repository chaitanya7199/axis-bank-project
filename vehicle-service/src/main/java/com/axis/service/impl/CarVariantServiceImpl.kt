package com.axis.service.impl

import com.axis.model.CarModel
import com.axis.repo.CarModelRepo
import com.axis.repo.CarVariantRepo
import com.axis.service.CarModelService
import com.axis.service.CarVariantService
import org.springframework.beans.factory.annotation.Autowired

class CarVariantServiceImpl: CarVariantService {

    @Autowired
    var carVariantRepo: CarVariantRepo = TODO()

    override fun getCarVariants(model_id: Int): List<String> {
        return carVariantRepo.findAllVariantsForModelId(model_id)
    }

    override fun findVariantId(variant: String): Int {
        return carVariantRepo.findVariantId(variant)
    }

}