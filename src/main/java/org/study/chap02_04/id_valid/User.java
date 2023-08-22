package org.study.chap02_04.id_valid;

public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean sameId(String idToFind) {
        return this.id.equals(idToFind);
    }
}