package org.study.solid.ISP.segregated_interface;

public interface ArticleRepositoryInterface {
    void createArticle();
    Article findArticleById(Long id);
}