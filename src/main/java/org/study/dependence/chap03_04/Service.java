package org.study.dependence.chap03_04;

import org.springframework.stereotype.Component;

@Component
public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void createArticle(String articleContent) {
        repository.someMethod(articleContent);
    }

}
