package com.imooc.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author xiaozefeng
 */
@Table(name = "product_category")
@Entity
@Data
public class ProductCategory {
    /**
     * 主键自增
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
