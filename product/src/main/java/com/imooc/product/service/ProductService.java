package com.imooc.product.service;

import com.imooc.product.entity.ProductInfo;

import java.util.List;

/**
 * @author xiaozefeng
 */
public interface ProductService {

    /**
     *
     * @return
     */
    List<ProductInfo> findUpAll();
}
