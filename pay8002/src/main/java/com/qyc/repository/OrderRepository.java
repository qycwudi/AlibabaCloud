package com.qyc.repository;

import com.qyc.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qyc
 * @time 2020/5/14 - 10:35
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
