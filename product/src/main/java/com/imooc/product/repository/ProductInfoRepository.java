package com.imooc.product.repository;

import com.imooc.product.enums.ProductStatus;
import com.imooc.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiaozefeng
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    /**
     * 根据状态查询商品信息
     *
     * @param status
     * @return
     */
    List<ProductInfo> findAllByProductStatus(ProductStatus status);
}
