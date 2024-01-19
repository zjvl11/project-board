package org.project.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private Article article; // 게시글 (id)
    private String content; // 본문


    //meta data
    private LocalDateTime createdAt; // 생성일자
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일자
    private String modifiedBy; // 수정자
}
