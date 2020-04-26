package com.ontop.zoath.result;

import com.alibaba.fastjson.JSON;

/**
 * @Description: 描述：统一API响应结果封装
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 10:45
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */
public class Result {
    private int code;
    private String message;
    private Object data;
    private Long timestamp;//时间戳
    private Long total;//结果总条数

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public Result setTotal(Long total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Result setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Result() {
    }

    public Result(int code, String message, Object data, Long timestamp) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }
}
