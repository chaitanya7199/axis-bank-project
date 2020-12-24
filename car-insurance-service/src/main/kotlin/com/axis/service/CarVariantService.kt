package com.axis.service

import com.axis.model.CarModel

interface CarVariantService {
    fun getCarVariants(model_id: Int): List<String>
    fun findVariantId(variant: String): Int
}