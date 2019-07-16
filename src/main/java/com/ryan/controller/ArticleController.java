package com.ryan.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryan.entity.Article;
import com.ryan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @Date : 2019:07:15
 * @Author : Lilanzhou
 * 说明 :
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/page")
    public String index(Model model, @RequestParam( value = "start",defaultValue = "0")int start){
        start=start<0?0:start;
        Page<Article> page = PageHelper.startPage(start, 2);
        List<Article> article = articleService.getAllArticle();
        PageInfo<Article> pageInfo = page.toPageInfo();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("article",article);
        return "index";
    }
}
