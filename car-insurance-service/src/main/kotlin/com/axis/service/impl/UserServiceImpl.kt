package com.axis.service.impl

import com.axis.model.User
import com.axis.repo.UserRepo
import com.axis.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {

    @Autowired
    var userRepo: UserRepo = TODO()

    override fun addUser(user: User) {
        userRepo.save(user)
    }
}