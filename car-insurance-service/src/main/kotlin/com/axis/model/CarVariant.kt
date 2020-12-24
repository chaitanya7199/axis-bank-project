package com.axis.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class CarVariant(
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        var variant_id: Int,
        @NotNull
        var model_id: Int,
        @NotNull
        var variant_name: String) {}