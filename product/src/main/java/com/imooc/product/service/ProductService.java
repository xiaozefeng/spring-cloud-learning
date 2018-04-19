package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.entity.ProductInfo;

import java.util.List;

/**
 * @author xiaozefeng
 */
public interface ProductService {

    /**
     * 查询在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 根据多个商品id 查询商品
     * @param productIdList
     * @return
     */
    List<ProductInfo> findByProductIdList(List<String> productIdList);

    /**
     * 扣库存
     * @param  cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
