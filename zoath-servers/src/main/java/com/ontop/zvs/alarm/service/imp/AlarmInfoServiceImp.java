package com.ontop.zoath.alarm.service.imp;

import com.github.pagehelper.Page;
import com.ontop.zoath.alarm.dao.AlarmInfoDao;
import com.ontop.zoath.alarm.model.AlarmInfo;
import com.ontop.zoath.alarm.model.AlarmItems;
import com.ontop.zoath.alarm.service.AlarmInfoService;
import com.ontop.zoath.alarm.vo.AlarmInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AlarmInfoServiceImp implements AlarmInfoService {

    @Autowired
    private AlarmInfoDao alarmInfoDao ;

    @Override
    public Page<AlarmInfo> selectAlarmInfoByPage(AlarmInfoVo alarmInfoVo) {
        return alarmInfoDao.selectAlarmInfoByPage(alarmInfoVo);
    }

    @Override
    public boolean addAlarmInfo(AlarmInfo alarmInfo) throws Exception {
        return false;
    }

    @Override
    public AlarmInfo selectAlarmInfoByAlarmId(Integer alarm_id) {
        return null;
    }

    @Override
    public boolean editAlarmInfo(AlarmInfo alarmInfo) throws Exception {
        return false;
    }

    @Override
    public boolean deleteAlarmInfoByAlarmId(Integer alarm_id) throws Exception {
        return false;
    }

    @Override
    public LinkedList<AlarmItems> selectAlarmItemByAlarmId(Integer alarm_id) {
        return null;
    }

    @Override
    public List<AlarmInfo> selectAllAlarmInfo(AlarmInfoVo alarmInfoVo) {
        return null;
    }

    @Override
    public List<AlarmInfo> selectAlarmInfoByParams(Integer object_id, String alarm_name) {
        return null;
    }

    @Override
    public List<AlarmInfo> selectAlarmInfoByDeviceId(Integer device_id) {
        return null;
    }
}
