package com.ontop.zoath.user.api;

import com.ontop.zoath.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description: 描述：
 * @Author: 作者：zxy
 * @CreateDate: 日期：2019/12/4$ 19:20$
 * @UpdateUser: 更新：
 * @UpdateRemark: 修改：
 * @Version: 版本：1.0
 */

@RequestMapping("/api/user")
public interface UserInfoApi {

    @RequestMapping(value = "/sleUser", method = RequestMethod.GET)
    public Result selectUserInfo();
}
