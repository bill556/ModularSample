package com.sino.module_common.empty_service

import com.sino.module_common.AppConfig
import com.sino.module_common.service.IArticleService

class EmptyArticleService : IArticleService {
    override fun getArticleDesc(): String? {
        AppConfig.moduleApps
        return null
    }
}