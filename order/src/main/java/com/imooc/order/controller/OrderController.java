package com.imooc.order.controller;

import com.google.common.collect.ImmutableMap;
import com.imooc.order.form.OrderForm;
import com.imooc.order.convert.OrderForm2OrderDTOConverter;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.service.OrderService;
import com.imooc.order.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 订单服务
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午9:37
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 1. 参数检验
     * 2. 查询商品信息 (调用服务)
     * 3. 计算总价
     * 4. 扣库存
     * 5. 订单入库
     */
    @PostMapping("/create")
    public ResultVO create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确， orderForm={}", orderForm);
            throw new OrderException(bindingResult.getFieldError().getDefaultMessage()
                    , ResultEnum.PARAM_ERROR.getCode());
        }

        // orderForm -> orderDTO
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }
        OrderDTO result = orderService.create(orderDTO);
        return ResultVO.ok(ImmutableMap.of("orderId", result.getOrderId()));
    }
}
