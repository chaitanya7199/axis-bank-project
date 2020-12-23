package com.axis.repo

import com.axis.model.CarModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CarModelRepo: JpaRepository<CarModel, Int>{

    @Query(value = "SELECT model_name FROM CarModel cm WHERE cm.brand_id = :brand_id")
    open fun findAllModelsForBrandId(@Param("brand_id") brand_id: Int): List<String>

    @Query(value = "SELECT model_id FROM CarModel cm WHERE cm.model_name = :model")
    open fun findModelId(@Param("model") model: String): Int
}