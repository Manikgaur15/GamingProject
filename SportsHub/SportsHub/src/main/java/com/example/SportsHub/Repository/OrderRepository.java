package com.example.SportsHub.Repository;

import com.example.SportsHub.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel,Integer> {

}
