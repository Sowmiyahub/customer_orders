package com.Sowmiya.customer_orders.repository;

import com.Sowmiya.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sowmiya
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
