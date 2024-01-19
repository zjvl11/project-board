package org.project.projectboard.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id;
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그

    //meta data
    private LocalDateTime createdAt; // 생성일자
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일자
    private String modifiedBy; // 수정자

}
