package com.ontop.zoath.alarm.service;

import com.github.pagehelper.Page;
import com.ontop.zoath.alarm.model.AlarmInfo;
import com.ontop.zoath.alarm.model.AlarmItems;
import com.ontop.zoath.alarm.vo.AlarmInfoVo;


import java.util.LinkedList;
import java.util.List;

/**
* @Description: 描述：
* @Author:      作者：ttsf
* @Date:        日期：2019/9/19 16:43
* @updata:      更新：
* @Param:       参数： * @param null :
* @return:      返回值：
*/
public interface AlarmInfoService {
    //报警信息分页查询功能
    Page<AlarmInfo> selectAlarmInfoByPage(AlarmInfoVo alarmInfoVo);

    //报警信息新增功能
    boolean addAlarmInfo(AlarmInfo alarmInfo) throws Exception;

    //根据alarm_id查询报警主表信息
    AlarmInfo selectAlarmInfoByAlarmId(Integer alarm_id);

    //报警信息修改功能
    boolean editAlarmInfo(AlarmInfo alarmInfo) throws Exception;

    //报警信息删除功能
    boolean deleteAlarmInfoByAlarmId(Integer alarm_id) throws Exception;

    //根据alarm_id查询报警信息子表数据
    LinkedList<AlarmItems> selectAlarmItemByAlarmId(Integer alarm_id);

    //查询所有报警信息功能
    List<AlarmInfo> selectAllAlarmInfo(AlarmInfoVo alarmInfoVo);

    List<AlarmInfo> selectAlarmInfoByParams(Integer object_id, String alarm_name);

    //模板生成 报警数据查询
	List<AlarmInfo> selectAlarmInfoByDeviceId(Integer device_id);
}
