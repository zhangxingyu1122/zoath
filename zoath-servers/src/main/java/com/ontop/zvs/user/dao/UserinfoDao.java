package com.ontop.zoath.user.dao;

import com.ontop.zoath.dao.zoathDao;
import com.ontop.zoath.user.model.UserinfoDo;
import com.ontop.zoath.user.vo.UserInfoVo;

import java.util.List;

public interface UserinfoDao extends zoathDao {

    public List<UserinfoDo> selectUserInfo();
}
