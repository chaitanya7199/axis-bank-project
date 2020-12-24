package com.axis.repo

import com.axis.model.CarModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CarVariantRepo: JpaRepository<CarModel, Int>{

    @Query(value = "SELECT variant_name FROM CarVariant cv WHERE cv.model_id = :model_id")
    open fun findAllVariantsForModelId(@Param("model_id") model_id: Int): List<String>

    @Query(value = "SELECT variant_id FROM CarVariant cv WHERE cv.variant_name = :variant")
    open fun findVariantId(@Param("variant") variant: String): Int
}