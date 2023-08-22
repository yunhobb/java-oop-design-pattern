package org.study.solid.ISP.segregated_interface;

public interface UserRepositoryInterface {
    void createUser();
    User findUserById(Long id);
}
