package com.imooc.product.repository;

import com.imooc.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiaozefeng
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    
    List<ProductCategory> findAllByCategoryType(List<Integer> categoryList);
}
