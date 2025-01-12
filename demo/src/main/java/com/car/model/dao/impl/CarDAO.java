package com.car.model.dao.impl;
import com.car.model.dao.GenericDAO;
import com.car.entity.Car;
import java.util.List;
public class CarDAO implements GenericDAO<Car> {
    
    @Override

    public int create(Car car) {
        return 0;
    }

    @Override
    public Car read(long id) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public List<Car> readAll() {
        return null;
    }

}
