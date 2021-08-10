package com.sino.module_common.service

interface IUserService {
    fun isLogin(): Boolean
    fun getUserId(): String?
}