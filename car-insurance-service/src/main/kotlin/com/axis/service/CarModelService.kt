package com.axis.service

import com.axis.model.CarModel

interface CarModelService {
    fun getCarModels(brand_id: Int): List<String>
    fun findModelId(model: String): Int
}