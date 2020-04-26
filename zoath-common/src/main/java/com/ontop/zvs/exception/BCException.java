package com.ontop.zoath.exception;

/**
 * @Description: 描述：异常编码
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 9:50
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
public class BCException extends RuntimeException {

    private int code;
    private String msg;

    public BCException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
