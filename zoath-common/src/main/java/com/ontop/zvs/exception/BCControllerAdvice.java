package com.ontop.zoath.exception;

import com.ontop.zoath.result.Result;
import com.ontop.zoath.result.ResultGenerator;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 描述：异常处理类
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 9:50
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
@ControllerAdvice
public class BCControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result errorHandler(Exception ex) {
        return ResultGenerator.getFailResult(ex.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = BCException.class)
    public Result DCerrorHandler(BCException ex) {
        return new Result(ex.getCode(), ex.getMsg(), null, System.currentTimeMillis());
    }

    //没有权限
    @ResponseBody
    @ExceptionHandler(value = AuthorizationException.class)
    public Result NoPermissionHandler(AuthorizationException ex) {
        return ResultGenerator.getUnAuthorizedResult();
    }


}
