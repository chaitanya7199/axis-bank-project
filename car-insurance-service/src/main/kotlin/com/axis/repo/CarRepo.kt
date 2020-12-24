package com.axis.repo

import com.axis.model.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepo: JpaRepository<Car, Int> {

}