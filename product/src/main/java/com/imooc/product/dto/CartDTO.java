package com.imooc.product.dto;

import lombok.Data;

/**
 * 扣库存DTO
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午11:15
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
