package com.sino.module_article

import android.app.Application
import com.sino.module_article.service.ArticleService
import com.sino.module_common.BaseApp
import com.sino.module_common.ServiceFactory

class ArticleApp : BaseApp() {
    override fun initModuleApp(application: Application) {
        ServiceFactory.article_service = ArticleService()
    }
}