package com.imooc.order.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 调用Product服务的Client接口
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午11:46
 */
@FeignClient("product")
public interface ProductClient {
    
}
