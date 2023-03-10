package com.example.BoardProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity // DB가 해당 객체를 인식 가능!
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Article {
    @Id // 대표값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;
    @Column
    private String content;



}
