package com.Sowmiya.customer_orders.repository;

import com.Sowmiya.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sowmiya
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
