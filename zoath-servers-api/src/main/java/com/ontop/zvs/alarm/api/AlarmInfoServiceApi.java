package com.ontop.zoath.alarm.api;


import com.ontop.zoath.alarm.model.AlarmInfo;
import com.ontop.zoath.alarm.vo.AlarmInfoVo;
import com.ontop.zoath.result.Result;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/alarmInfo")
public interface AlarmInfoServiceApi {
    //报警信息分页查询功能
    @RequestMapping(value = "/selectAlarmInfoByPage", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/selectAlarmInfoByPage")
    public Result selectAlarmInfoByPage(@RequestBody AlarmInfoVo alarmInfoVo);

    //报警信息新增功能
    @RequestMapping(value = "/addAlarmInfo", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/addAlarmInfo")
    public Result addAlarmInfo(String alarmInfoVo);

    //报警信息修改功能
    @RequestMapping(value = "/editAlarmInfo", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/editAlarmInfo")
    public Result editAlarmInfo(@RequestBody AlarmInfo alarmInfo) throws Exception;

    //报警信息删除功能
    @RequestMapping(value = "/deleteAlarmInfo", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/deleteAlarmInfo")
    public Result deleteAlarmInfo(Integer alarm_id) throws Exception;

    //根据主键ID查询报警信息功能
    @RequestMapping(value = "/selectAlarmInfoById", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/selectAlarmInfoById")
    public Result selectAlarmInfoById(Integer alarm_id);

    //查询所有报警信息功能
    @RequestMapping(value = "/selectAllAlarmInfo", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/selectAllAlarmInfo")
    public Result selectAllAlarmInfo(AlarmInfoVo alarmInfoVo);

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @RequiresPermissions("/alarmInfo/test")
    public Result test(@RequestParam("name") String name);

}
