package com.imooc.order.repository;

import com.imooc.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaozefeng
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
