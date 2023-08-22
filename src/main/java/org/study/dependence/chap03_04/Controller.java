package org.study.dependence.chap03_04;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value = "/some-api")
    public void someApi() {
        service.createArticle("의미없는 데이터");
    }
}
