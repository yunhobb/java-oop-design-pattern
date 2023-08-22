package org.study.solid.ISP.integrated_interface;

public interface Repository {
    void createUser();
    User findUserById(Long id);

    void createArticle();
    Article findArticleById(Long id);
}