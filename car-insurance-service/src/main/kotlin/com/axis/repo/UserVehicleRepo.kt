package com.axis.repo

import com.axis.model.UserVehicle
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserVehicleRepo: JpaRepository<UserVehicle, Int> {
}