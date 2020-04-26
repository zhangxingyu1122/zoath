package com.ontop.zoath.user.service;

import com.ontop.zoath.user.model.UserinfoDo;
import com.ontop.zoath.user.vo.UserInfoVo;

import java.util.List;

public interface UserinfoService {

    public List<UserinfoDo> selectUserInfo();
}
