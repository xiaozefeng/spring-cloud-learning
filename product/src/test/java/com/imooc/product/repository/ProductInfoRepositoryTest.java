package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.enums.ProductStatus;
import com.imooc.product.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findAllByProductStatus() {
        List<ProductInfo> list = productInfoRepository.findAllByProductStatus(ProductStatus.UP
        );
        Assert.assertTrue(list.size() > 0);
    }
}