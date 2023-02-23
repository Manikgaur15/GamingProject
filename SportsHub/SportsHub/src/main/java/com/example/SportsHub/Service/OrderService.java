package com.example.SportsHub.Service;


import com.example.SportsHub.Model.OrderModel;
import com.example.SportsHub.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepositoryObject;

    public void addorder(OrderModel orderModelObject){
        orderRepositoryObject.save(orderModelObject);
    }

    public List<OrderModel>displayorder(){
        return orderRepositoryObject.findAll();
    }

    public Optional<OrderModel>displayorderById(int id){
        return orderRepositoryObject.findById(id);
    }
    public String deleteorderById(int id){
        orderRepositoryObject.deleteById(id);
        return "Deleted";
    }
    public String updateorder(int id,OrderModel orderModelObject){
      if (orderRepositoryObject.findById(id)!=null){
          orderRepositoryObject.deleteById(id);
          orderRepositoryObject.save(orderModelObject);
          return "Updated";
      }
      return "No Order found";
    }
}
