package com.imooc.product.service.impl;

import com.imooc.product.entity.ProductCategory;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaozefeng
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findCategoryTypeIn(List<Integer> categoryList) {
        return productCategoryRepository.findAllByCategoryType(categoryList);
    }
    
}
