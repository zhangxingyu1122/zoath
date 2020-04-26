package com.ontop.zoath.alarm.dao;

import com.github.pagehelper.Page;
import com.ontop.zoath.alarm.model.AlarmInfo;
import com.ontop.zoath.alarm.model.AlarmInfoPress;
import com.ontop.zoath.alarm.model.AlarmItems;
import com.ontop.zoath.alarm.vo.AlarmInfoVo;
import com.ontop.zoath.dao.zoathDao;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/12/5 11:56
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
public interface AlarmInfoDao extends zoathDao {
    //报警信息分页查询功能
    Page<AlarmInfo> selectAlarmInfoByPage(AlarmInfoVo alarmInfoVo);

    //报警信息新增功能-主表
    Integer insertAlarmInfo(AlarmInfo alarmInfo);

    //报警信息新增功能-子表
    Integer insertAlarmItems(@Param("alarmItemsList") LinkedList<AlarmItems> alarmItemsList);

    //报警信息新增功能-子表
    AlarmInfo selectAlarmInfoByAlarmId(Integer alarm_id);

    //根据alarm_id更新报警主表信息
    Integer updateAlarmInfoByAlarmId(AlarmInfo alarmInfo);

    //根据alarm_id删除报警子表信息
    Integer deleteAlarmItemsByAlarmId(Integer alarm_id);

    //根据alarm_id删除报警主表信息
    Integer deleteAlarmInfoByAlarmId(Integer alarm_id);

    //根据alarm_id查询报警信息子表数据
    LinkedList<AlarmItems> selectAlarmItemByAlarmId(Integer alarm_id);

    //查询所有报警信息功能
    List<AlarmInfo> selectAllAlarmInfo(AlarmInfoVo alarmInfoVo);

    //获得数据点id集合
    List<Integer> selectPointDataIdListByAlarmIdList(@Param("alarmIdList") List<Integer> alarmIdList);

    //获得数据点基础信息数据
    List<Map> selectPointDataIdPointKeyMapListByPointDataIdList(@Param("pointDataIdList") List<Integer> pointDataIdList);

    //获得报警条件集合
    List<AlarmInfo> selectAlarmInfoListByAlarmIdList(@Param("alarmIdList") List<Integer> alarmIdList);

    //获得对象信息集合
    List<AlarmInfoPress> selectAlarmInfoPressListByPointDataIdList(@Param("pointDataIdList") List<Integer> pointDataIdList);

    //获得所有报警条件明细数据
    List<AlarmItems> selectAllAlarmItems();

    List<AlarmInfoPress> selectAlarmInfoPressListByAlarmIdList(@Param("alarmIdList") List<Integer> alarmIdList);

    //根据object_id  获得报警信息
    List<AlarmInfo> selectAlarmInfoListByObjectId(Integer object_id);

    //根据名称，查询设备下报警信息
    List<AlarmInfo> selectAlarmInfoByParams(@Param("object_id") Integer object_id,
                                            @Param("alarm_name") String alarm_name);

    void addAlarmItems(AlarmItems items);

    //模板生成 报警数据查询
    List<AlarmInfo> selectAlarmInfoByDeviceId(Integer object_id);

    //根据类型id查找类型是否被引用
    int selectAlarmTypeStatusById(Integer type_id);
}
