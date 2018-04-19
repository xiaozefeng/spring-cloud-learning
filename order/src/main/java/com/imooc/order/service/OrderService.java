package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Order Service
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午9:39
 */
public interface OrderService {
    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
