package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmHisExperience implements Serializable {
    //设备名称
    private String object_name;
    //报警级别
    private String alarm_level;
    // 报警描述：
    private String alarm_desc;
    //报警名称：
    private String alarm_name;
    // 报警值：
    private Float alarm_value;
    //报警提醒：
    private Integer his_rule;
    //增加数据点和设备的判断条件alarm_id =0 为数据点：
    private Integer alarm_id;
    //报警原因
    private String alarm_reason;
    // 报警时间：
    private Date alarm_time;
    // 报警时间app
    private String alarm_time_app;
    // 报警的处理方法
    private String press_method;
    //确认用户
    private String user_name;
    //确认时间
    private String confirm_time;
    //报警历史数据
    List<AlarmHisExperienceItems> itemsList;
    //新增加历史经验信息
    private String alarm_info_desc;  //报警的基本信息描述 ;
    private String alarm_info_value;  //报警的基本信息值 ;
    private String alarm_info_express;  //报警的基本信息表达式;
}
