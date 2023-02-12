package com.example.BoardProject.repository;

import com.example.BoardProject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//  <관리 대상, 기본 값의 타입 >
public interface ArticleRepository extends CrudRepository<Article,Long> {
    @Override
    ArrayList<Article> findAll();
}
