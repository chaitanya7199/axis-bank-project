package com.axis.repo

import com.axis.model.CarBrand
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BrandRepo: JpaRepository<CarBrand, Int>{
}