package org.study.solid.ISP.integrated_interface;

public class UserService {
    private Repository repository = new UserRepository();

    public void createUser() {
        repository.createUser();
    }

    public User findByUser(Long id) {
        return repository.findUserById(id);
    }
}