package com.axis.model

import java.sql.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class UserVehicle(
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        var uv_id: Int,
        @NotNull
        var user_id: Int,
        @NotNull
        var vehicle_id: Int,
        @NotNull
        var registration_number: Int,
        @NotNull
        var purchase_date: Date,
        @NotNull
        var registered_city: String
) {
}