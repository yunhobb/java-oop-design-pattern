package org.study.designPattern.adapterPtn;

public interface Repository {

    User findById(Long id);
    void save(User user);
}
