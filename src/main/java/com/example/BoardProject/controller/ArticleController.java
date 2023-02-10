package com.example.BoardProject.controller;

import com.example.BoardProject.dto.ArticleForm;
import com.example.BoardProject.entity.Article;
import com.example.BoardProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다 자동 연결
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new"; // template 폴더 기준
    }

    @PostMapping("articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        // 1. DTO을 Entity로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB 안에 저장하게 함!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }
}
