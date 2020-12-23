package com.axis.service

import com.axis.model.CarBrand

interface CarBrandService {
    fun getCarBrands(): List<CarBrand>
    fun getCarBrandId(brand: String): Int
}