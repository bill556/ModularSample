package com.sino.module_user

import android.app.Application
import com.sino.module_common.BaseApp
import com.sino.module_common.ServiceFactory
import com.sino.module_user.service.UserService

class LoginApp : BaseApp() {
    override fun initModuleApp(application: Application) {
        ServiceFactory.user_service = UserService()
    }
}