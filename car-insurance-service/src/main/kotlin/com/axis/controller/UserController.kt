package com.axis.controller

import com.axis.model.User
import com.axis.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/users")
class UserController {

    @Autowired
    var userService: UserService = TODO()

    @PostMapping
    fun addUser(@RequestBody user: User) {
        userService.addUser(user)
    }
}