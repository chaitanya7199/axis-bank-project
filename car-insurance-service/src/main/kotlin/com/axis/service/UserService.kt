package com.axis.service

import com.axis.model.User

interface UserService {
    fun addUser(user: User)
}