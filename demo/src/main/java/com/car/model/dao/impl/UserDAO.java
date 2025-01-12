package com.car.model.dao.impl;
import com.car.model.dao.GenericDAO;
import com.car.entity.User;
import java.util.List;
public class UserDAO implements GenericDAO<User> {
    
    @Override

    public int create(User user) {
        return 0;
    }

    @Override
    public User read(long id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

}
