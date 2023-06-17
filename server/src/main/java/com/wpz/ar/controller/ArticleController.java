package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Article;
import com.wpz.ar.service.ArticleService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/9 08:17
 */
@RestController
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/add")
    public R add(@RequestBody Article article) {
        articleService.add(article);
        return R.ok(null);
    }

    // 根据主键更新
    @PostMapping("/update")
    public R update(@RequestBody Article article) {
        articleService.update(article);
        return R.ok(null);
    }

    @PostMapping("/getArticle")
    public R getArticle(@RequestBody Article article) {
        Article res = articleService.getArticle(article);
        return R.ok(res);
    }

    @PostMapping("/getArticles")
    public R getArticles(@RequestBody Article article) {
        PageInfo<Article> pageInfo = articleService.getArticles(article);
        return R.ok(pageInfo);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Article article) {
        articleService.delete(article);
    }
}
