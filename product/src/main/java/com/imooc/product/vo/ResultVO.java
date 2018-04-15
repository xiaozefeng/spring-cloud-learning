package com.imooc.product.vo;

import lombok.Data;

/**
 * HTTP 返回的最外层对象
 *
 * @author xiaozefeng
 */
@Data
public class ResultVO<T> {
    /**
     * 正常返回0
     */
    private Integer code;
    /**
     * code为0时msg为成功消息
     * 否则是错误消息
     */
    private String msg;
    /**
     * 消息体所包含的对象
     */
    private T data;


    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResultVO ok(T data){
        return new ResultVO(0, "success", data);
    }
}
