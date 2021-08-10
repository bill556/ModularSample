package com.sino.module_common

import android.app.Application

abstract class BaseApp: Application() {
    abstract fun initModuleApp(application: Application)
}