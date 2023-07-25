package com.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdv.entities.OrderItem;
import com.pdv.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
