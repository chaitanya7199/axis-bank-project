package com.axis.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class User(
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        var user_id: Int,
        @NotNull
        var full_name: String,
        @NotNull
        var email: String,
        @NotNull
        var phone_number: String
) {
}