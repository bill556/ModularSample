package com.sino.module_common

import com.sino.module_common.empty_service.EmptyArticleService
import com.sino.module_common.empty_service.EmptyUserService
import com.sino.module_common.service.IArticleService
import com.sino.module_common.service.IUserService

/**
 * 集中管理实现组件间数据数据通信的接口
 */
object ServiceFactory {
    var user_service: IUserService = EmptyUserService()
    var article_service: IArticleService = EmptyArticleService()
}