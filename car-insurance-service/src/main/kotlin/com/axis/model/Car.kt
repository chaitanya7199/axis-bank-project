package com.axis.model

import org.springframework.lang.Nullable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Car(
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        var vehicle_id: Int,
        var brand_id: Int,
        var model_id: Int,
        var variant_id: Int) {}