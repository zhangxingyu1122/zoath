package com.ontop.zoath.alarm.controller;

import com.github.pagehelper.Page;
import com.ontop.zoath.alarm.api.AlarmInfoServiceApi;
import com.ontop.zoath.alarm.model.AlarmInfo;
import com.ontop.zoath.alarm.service.AlarmInfoService;
import com.ontop.zoath.alarm.vo.AlarmInfoVo;
import com.ontop.zoath.result.Result;
import com.ontop.zoath.result.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Description: 描述：报警服务
 * @Author:      作者：ttsf
 * @Date:        日期：2019/8/30 11:13
 * @updata:      更新：
 * @Param:       参数：
 * @return:      返回值：
 */
@RestController
public class AlarmInfoController implements AlarmInfoServiceApi {
    private static final Logger logger = LoggerFactory.getLogger(AlarmInfoController.class);
    private final static String AND_CHAR = "0";
    private final static String OR_CHAR = "1";
    private final static String AND = "AND";
    private final static String OR = "OR";



    @Autowired
    private AlarmInfoService alarmInfoService;


    /**
    * @Description: 描述：分页查询报警信息，此功能为设备医生，数字孪生，数据湖公用，module_type 前端传，不传为数据湖
    * @Author:      作者：ttsf
    * @Date:        日期：2019/8/30 11:13
    * @updata:      更新：
    * @Param:       参数：
    * @return:      返回值：
    */
    @Override
    public Result selectAlarmInfoByPage(AlarmInfoVo alarmInfoVo) {

        if (null == alarmInfoVo) {
            return ResultGenerator.getFailResult("查询条件不能为空！");
        }
        if (null == alarmInfoVo.getPageNum()) {
            return ResultGenerator.getFailResult("pageNum不能为空");
        }
        if (null == alarmInfoVo.getPageSize()) {
            return ResultGenerator.getFailResult("pageSize不能为空");
        }
        Page<AlarmInfo> pageList = alarmInfoService.selectAlarmInfoByPage(alarmInfoVo);
        return ResultGenerator.getSuccessResult(pageList, pageList.getTotal());
    }

    @Override
    public Result addAlarmInfo(String alarmInfoVo) {
        return ResultGenerator.getSuccessResult(alarmInfoVo);
    }

    @Override
    public Result editAlarmInfo(AlarmInfo alarmInfo) throws Exception {
        return null;
    }

    @Override
    public Result deleteAlarmInfo(Integer alarm_id) throws Exception {
        return null;
    }

    @Override
    public Result selectAlarmInfoById(Integer alarm_id) {
        return null;
    }


    /**
    * @Description: 描述： 查询所有报警信息
    * @Author:      作者：ttsf
    * @Date:        日期：2019/8/30 11:18
    * @updata:      更新：
    * @Param:       参数： * @param null :
    * @return:      返回值：
    */
    @Override
    public Result selectAllAlarmInfo(AlarmInfoVo alarmInfoVo) {

        if (null == alarmInfoVo) {
            return ResultGenerator.getFailResult("报警信息查询条件不能为空，请核对！");
        }
        if (null == alarmInfoVo.getCreate_user_id()) {
            return ResultGenerator.getFailResult("创建人信息不能为空，请核对！");
        }
        List<AlarmInfo> alarmInfoList = alarmInfoService.selectAllAlarmInfo(alarmInfoVo);
        return ResultGenerator.getSuccessResult(alarmInfoList);
    }

    @Override
    public Result test(String name) {
        return ResultGenerator.getSuccessResult(name);
    }
}
