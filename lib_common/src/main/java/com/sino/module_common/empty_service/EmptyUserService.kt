package com.sino.module_common.empty_service

import com.sino.module_common.service.IUserService

class EmptyUserService : IUserService {
    override fun isLogin() = false

    override fun getUserId(): String? = null
}