package com.imooc.product.controller;

import com.imooc.product.entity.ProductCategory;
import com.imooc.product.entity.ProductInfo;
import com.imooc.product.service.CategoryService;
import com.imooc.product.service.ProductService;
import com.imooc.product.vo.ProductInfoVO;
import com.imooc.product.vo.ProductVO;
import com.imooc.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiaozefeng
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目的type类目
     * 3. 查询类目
     * 4. 构造数据
     *
     * @return
     */
    @GetMapping("/list")
    public ResultVO productInfoList() {
        // 1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();


        // 2. 获取类目的type类目
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        // 3. 查询类目
        List<ProductCategory> productCategoryList = categoryService.findCategoryTypeIn(categoryTypeList);

        // 4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        productCategoryList.forEach(category -> {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getCategoryName());
            productVO.setCategoryType(category.getCategoryType());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            productInfoList.stream()
                    .filter(p -> p.getCategoryType().equals(category.getCategoryType()))
                    .forEach(productInfo -> {
                        ProductInfoVO productInfoVO = new ProductInfoVO();
                        BeanUtils.copyProperties(productInfo, productInfoVO);
                        productInfoVOList.add(productInfoVO);
                    });
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        });

        return ResultVO.ok(productVOList);
    }

}
