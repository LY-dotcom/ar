package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Article;

public interface ArticleService {
    void add(Article article);

    void update(Article article);

    Article getArticle(Article article);

    PageInfo<Article> getArticles(Article article);

    void delete(Article article);
}
