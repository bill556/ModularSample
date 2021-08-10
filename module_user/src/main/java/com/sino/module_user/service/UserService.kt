package com.sino.module_user.service

import com.sino.module_common.service.IUserService
import com.sino.module_user.LoginActivity

class UserService : IUserService {
    override fun isLogin(): Boolean {
        return LoginActivity.isLogin
    }

    override fun getUserId(): String? {
        return "这是用户信息"
    }
}