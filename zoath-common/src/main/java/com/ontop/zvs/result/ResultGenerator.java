package com.ontop.zoath.result;


/**
 * @Description: 描述： 结果返回类
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 9:51
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";


    // 返回无权限
    public static Result getUnAuthorizedResult() {
        return new Result()
                .setCode(ResultCode.UNAUTHORIZED)
                .setMessage("没有权限！")
                .setTimestamp(System.currentTimeMillis());
    }

    //返回执行成功
    public static Result getSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setTimestamp(System.currentTimeMillis());
    }

    //根据输入类型返回json 对象
    public static Result getSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data)
                .setTimestamp(System.currentTimeMillis());
    }

    //根据输入类型返回json 对象
    public static Result getSuccessResult(Object data, long total) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data)
                .setTotal(total)
                .setTimestamp(System.currentTimeMillis());
    }

    //返回执行失败
    public static Result getFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message)
                .setTimestamp(System.currentTimeMillis());
    }

    //返回token失效
    public static Result getTokenInvalidResult(String message) {
        return new Result()
                .setCode(ResultCode.TOKEN_INVALID)
                .setMessage(message)
                .setTimestamp(System.currentTimeMillis());
    }

    //service-api 参数异常
    private static final String DEFAULT_FAIL_PARM_SERVICE_API = "service-api 参数异常！";

    //service-api 层参数异常
    public static Result getFailResultByServiceApiParm() {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(DEFAULT_FAIL_PARM_SERVICE_API)
                .setTimestamp(System.currentTimeMillis());
    }

    // 用户不可见的，前后端处理数据的参数异常
    // （比如：company_id user_id module_id 等信息，非用户输入或者用户不知道语义或页面未体现的，但是却用于前后端数据交互的参数）
    private static final String FAIL_PARM_MSG_USER_UNKNOWN = "接口参数异常：";

    public static String getFailPramMsgUserUnknown(String customMsg) {
        return FAIL_PARM_MSG_USER_UNKNOWN + customMsg;
    }

    /**
     * @Description: 描述：app处于维护阶段
     * @Author: 作者：ttsf
     * @Date: 日期：2019/8/8 9:12
     * @updata: 更新：
     * @Param: 参数：
     * @return: 返回值：
     */

    public static Result getIsRepairResult(Object data) {
        return new Result()
                .setCode(ResultCode.IS_REPAIR)
                .setMessage("维护阶段")
                .setData(data)
                .setTimestamp(System.currentTimeMillis());
    }

    /**
     * @Description: 描述：app版本差异
     * @Author: 作者：ttsf
     * @Date: 日期：2019/8/8 9:12
     * @updata: 更新：
     * @Param: 参数：
     * @return: 返回值：
     */
    public static Result getIsDifferenceResult(Object data) {
        return new Result()
                .setCode(ResultCode.IS_DIFFERENCE)
                .setMessage("版本差异")
                .setData(data)
                .setTimestamp(System.currentTimeMillis());
    }

    /**
     * @Description: 描述：app强制更新
     * @Author: 作者：ttsf
     * @Date: 日期：2019/8/8 9:12
     * @updata: 更新：
     * @Param: 参数：
     * @return: 返回值：
     */
    public static Result getIsForceUpdateResult(Object data) {
        return new Result()
                .setCode(ResultCode.IS_FORCE_UPDATE)
                .setMessage("APP版本差异较大，强制更新")
                .setData(data)
                .setTimestamp(System.currentTimeMillis());
    }

    /**
     * @Description: 描述：app token失效
     * @Author: 作者：ttsf
     * @Date: 日期：2019/8/8 9:12
     * @updata: 更新：
     * @Param: 参数：
     * @return: 返回值：
     */
    public static Result getTokenInvalid() {
        return new Result()
                .setCode(ResultCode.TOKEN_INVALID)
                .setMessage("token is invalid")
                .setTimestamp(System.currentTimeMillis());
    }
}
