package com.example.SportsHub.Controller;


import com.example.SportsHub.Model.OrderModel;
import com.example.SportsHub.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderServiceObject;

    @PostMapping("/addorder")
    public void addorder(@RequestBody OrderModel orderModelObject){
        orderServiceObject.addorder(orderModelObject);
    }

    @GetMapping("/getorder")
    public List<OrderModel>displayorder(){
      return   orderServiceObject.displayorder();
    }
    @GetMapping("/getorderById/{id}")
    public Optional<OrderModel>displayorderById(@PathVariable int id){
        return orderServiceObject.displayorderById(id);
    }

    @DeleteMapping("/deleteorder/{id}")
    public String deleteorderById(@PathVariable int id){
        return orderServiceObject.deleteorderById(id);
    }

    @PutMapping("/updateorder")
    public String updateorder(@PathVariable int id,@RequestBody OrderModel orderModelObject){
        return orderServiceObject.updateorder(id, orderModelObject);
    }
}
