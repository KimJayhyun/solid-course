package com.company.intersegrega.service;

import java.util.HashMap;
import java.util.Map;

import com.company.intersegrega.entity.Order;

public class OrderPersistenceService implements PersistenceService<Order> {
    
    private static final Map<Long, Order> ORDERS = new HashMap<>();
    
    @Override
    public void save(Order entity) {
        // TODO Auto-generated method stub
        synchronized (ORDERS) {
            ORDERS.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        // TODO Auto-generated method stub
        synchronized (ORDERS) {
            ORDERS.remove(entity.getId(), entity);
        }
        
    }

    @Override
    public Order findById(Long id) {
        // TODO Auto-generated method stub
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

    // @Override
    // public List<Order> findByName(String name) {
    //     throw new UnsupportedOperationException("Find by name is not supported");
    // }

}
