package org.study.designPattern.adapterPtn;

public class FileStorgeAdapter implements Repository {

    private FileStorage fileStorage = new FileStorage();
    private String fileName = "어떤 파일 이름";

    @Override
    public User findById(Long id) {

    }

    @Override
    public void save(User user) {

    }


}
