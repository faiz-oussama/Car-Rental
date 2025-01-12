package com.car.model.dao.impl;
import com.car.entity.Order;
import com.car.model.dao.GenericDAO;

import java.util.List;
public class OrderDAO implements GenericDAO<Order> {
    
    @Override
    public int create(Order order) {
        return 0;
    }

    @Override
    public Order read(long id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public List<Order> readAll() {
        return null;
    }

}
