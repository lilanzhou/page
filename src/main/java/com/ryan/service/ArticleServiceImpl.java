package com.ryan.service;

import com.ryan.dao.ArticleMapper;
import com.ryan.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date : 2019:07:15
 * @Author : Lilanzhou
 * 说明 :
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleMapper articleMapper;


    @Override
    public List<Article> getAllArticle() {
        return articleMapper.getAllArticle();
    }
}
