package com.ontop.zoath.user.controller;

import com.ontop.zoath.result.Result;
import com.ontop.zoath.result.ResultGenerator;
import com.ontop.zoath.user.api.UserInfoApi;
import com.ontop.zoath.user.model.UserinfoDo;
import com.ontop.zoath.user.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserinfoController implements UserInfoApi {

    @Autowired
    private UserinfoService userinfoService;

    @Override
    public Result selectUserInfo() {
        List<UserinfoDo> listUserInfo = userinfoService.selectUserInfo();
        return ResultGenerator.getSuccessResult(listUserInfo);
    }
}
