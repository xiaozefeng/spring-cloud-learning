package com.imooc.product.entity;

import com.imooc.product.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiaozefeng
 */
@Entity
@Table(name = "product_info")
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
