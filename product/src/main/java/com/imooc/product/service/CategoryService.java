package com.imooc.product.service;

import com.imooc.product.entity.ProductCategory;

import java.util.List;

/**
 * @author xiaozefeng
 */
public interface CategoryService {

    /**
     * 根据categoryType查询商品类型列表
     *
     * @param categoryList
     * @return
     */
    List<ProductCategory> findCategoryTypeIn(List<Integer> categoryList);
}
