package org.study.solid.ISP.segregated_interface;

public class ArticleRepository implements ArticleRepositoryInterface {

    @Override
    public void createArticle() {
        // 의미 있는 어떤 로직
    }

    @Override
    public Article findArticleById(Long id) {
        // 의미 있는 어떤 로직
        return null;
    }
}

