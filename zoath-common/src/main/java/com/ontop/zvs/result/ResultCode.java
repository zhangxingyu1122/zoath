package com.ontop.zoath.result;

/**
 * 响应码枚举，参考HTTP状态码的语义
 *
 * @Author lihousheng
 * @Date 2018年7月18日下午1:58:11
 */
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 未认证（签名错误），没有权限
     */
    UNAUTHORIZED(401),
    /**
     * 禁止访问
     */
    NO_PERMISSION(403),
    /**
     * 接口不存在
     */
    NOT_FOUND(404),
    /**
     * token 失效
     */
    TOKEN_INVALID(506),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500),
    /**
     * app有最新版本
     */
    IS_DIFFERENCE(300),
    /**
     * app处于维护阶段
     */
    IS_REPAIR(301),
    /**
     * app需要强制更新
     */
    IS_FORCE_UPDATE(302);


    /**
     * 未认证（签名错误），没有权限
     */

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
