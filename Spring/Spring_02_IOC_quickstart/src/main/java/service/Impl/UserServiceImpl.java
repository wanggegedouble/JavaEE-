package service.Impl;

import dao.Dao;
import dao.Impl.UserDao;
import dao.Impl.UserDaoImplTwo;
import service.UserService;


public class UserServiceImpl implements UserService {
    private Dao dao;

    public void setDao(Dao dao){
        this.dao = dao;
    }
    @Override
    public void save() {
        dao.save();
        System.out.println("service~~~");
    }

    @Override
    public void update() {
        dao.update();
        System.out.println("service~~~");
    }

    @Override
    public void delete() {
        dao.delete();
        System.out.println("service~~~");
    }

    @Override
    public void query() {
        dao.query();
        System.out.println("service~~~");
    }
}
