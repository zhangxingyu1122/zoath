package com.ontop.zoath.user.service.imp;

import com.ontop.zoath.user.dao.UserinfoDao;
import com.ontop.zoath.user.model.UserinfoDo;
import com.ontop.zoath.user.service.UserinfoService;
import com.ontop.zoath.user.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImp implements UserinfoService {

    @Autowired
    private UserinfoDao userinfoDao;

    @Override
    public List<UserinfoDo> selectUserInfo() {
        return userinfoDao.selectUserInfo();
    }
}
