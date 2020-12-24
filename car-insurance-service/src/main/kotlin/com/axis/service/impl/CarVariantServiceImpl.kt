package com.axis.service.impl

import com.axis.repo.CarVariantRepo
import com.axis.service.CarVariantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
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