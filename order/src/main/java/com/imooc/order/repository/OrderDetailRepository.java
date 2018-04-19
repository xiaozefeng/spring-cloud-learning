package com.imooc.order.repository;

import com.imooc.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaozefeng
 */
public interface OrderDetailRepository extends JpaRepository<OrderMaster, String> {
}
