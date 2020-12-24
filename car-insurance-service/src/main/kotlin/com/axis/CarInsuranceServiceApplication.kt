package com.axis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarInsuranceServiceApplication

fun main(args: Array<String>) {
	runApplication<CarInsuranceServiceApplication>(*args)
}
