package dao.Impl;

import dao.Dao;

public class UserDaoImplTwo implements Dao {
    @Override
    public void save() {
        System.out.println("UserDaoImplTwo.save");
    }
    @Override
    public void update() {
        System.out.println("UserDaoImplTwo.update");
    }

    @Override
    public void delete() {
        System.out.println("UserDaoImplTwo.delete");
    }

    @Override
    public void query() {
        System.out.println("UserDaoImplTwo.query");
    }
}
