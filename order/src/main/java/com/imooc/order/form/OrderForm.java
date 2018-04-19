package com.imooc.order.form;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Order表单
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午10:01
 */
@Getter
@Setter
public class OrderForm {

    /**
     * 买家名称
     */
    @NotEmpty(message = "姓名必填s")
    private String name;
    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家微信openid
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    /**
     * 购物车
     */
    @NotEmpty(message = "购物车必填")
    private String items;
}
