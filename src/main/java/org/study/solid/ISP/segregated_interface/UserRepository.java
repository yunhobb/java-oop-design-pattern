package org.study.solid.ISP.segregated_interface;

public class UserRepository implements UserRepositoryInterface {

    @Override
    public void createUser() {
        // 의미 있는 어떤 로직
    }

    @Override
    public User findUserById(Long id) {
        // 의미 있는 어떤 로직
        return null;
    }
}