package com.axis.service

import com.axis.model.CarBrand

interface VehicleService {
    fun getCarBrands(): List<CarBrand>
}