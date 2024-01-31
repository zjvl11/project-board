package org.project.projectboard.dto.request;

import org.project.projectboard.dto.ArticleCommentDto;
import org.project.projectboard.dto.UserAccountDto;

/**
 * DTO for {@link org.project.projectboard.domain.ArticleComment}
 */
public record ArticleCommentRequest(Long articleId, String content){

    public static ArticleCommentRequest of(Long articleId, String content){
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto){
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }
}