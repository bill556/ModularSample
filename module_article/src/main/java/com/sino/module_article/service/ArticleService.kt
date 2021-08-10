package com.sino.module_article.service

import com.sino.module_common.service.IArticleService

class ArticleService : IArticleService {
    override fun getArticleDesc(): String? {
        return "这是一个文章的简介"
    }
}