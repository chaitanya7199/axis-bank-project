package com.axis.repo

import com.axis.model.CarBrand
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CarBrandRepo: JpaRepository<CarBrand, Int>{

    @Query(value = "SELECT brand_id FROM CarBrand cb WHERE cb.brand_name = :brand")
    open fun findCarBrandId(@Param("brand") brand: String): Int
}