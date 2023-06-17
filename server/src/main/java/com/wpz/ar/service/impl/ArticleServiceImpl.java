package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Article;
import com.wpz.ar.domain.ArticleExample;
import com.wpz.ar.mapper.ApplicantMapper;
import com.wpz.ar.mapper.ArticleMapper;
import com.wpz.ar.service.ArticleService;
import com.wpz.ar.service.StarRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/9 08:17
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void update(Article article) {
        articleMapper.updateByPrimaryKeySelective(article);
    }

    @Autowired
    private ApplicantMapper applicantMapper;
    @Override
    public Article getArticle(Article article) {
        Article res = articleMapper.selectByPrimaryKey(article.getId());
        res.setApplicant(applicantMapper.selectByPrimaryKey(res.getApplicantId()));
        return res;
    }

    // 默认按照观看量排序
    @Override
    public PageInfo<Article> getArticles(Article article) {

        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(article.getTitle())) {
            criteria.andTitleLike("%" + article.getTitle() + "%");
        }
        if (article.getApplicantId() != null) {
            criteria.andApplicantIdEqualTo(article.getApplicantId());
        }
        if (article.getStatus() != null && !("" + article.getStatus()).equals("")) {
            criteria.andStatusEqualTo(article.getStatus());
        }
        PageHelper.startPage(article.getPageNum(), article.getPageSize());
        List<Article> list = articleMapper.selectByExampleWithBLOBs(example);
        for (Article article1 : list) {
            article1.setApplicant(applicantMapper.selectByPrimaryKey(article1.getApplicantId()));
        }
        PageInfo<Article> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void delete(Article article) {
        articleMapper.deleteByPrimaryKey(article.getId());
    }
}
