package com.example.BoardProject.repository;

import com.example.BoardProject.entity.Article;
import org.springframework.data.repository.CrudRepository;

//  <관리 대상, 기본 값의 타입 >
public interface ArticleRepository extends CrudRepository<Article,Long> {

}
