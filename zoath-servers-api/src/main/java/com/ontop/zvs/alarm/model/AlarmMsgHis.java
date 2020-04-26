package com.ontop.zoath.alarm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Describtion:历史报警实体类
 * @Author: yinyl
 * @Date: 2018/10/23 17:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmMsgHis implements Serializable {

    private Integer msg_id;
    private Integer module_type;
    private Integer alarm_id;
    private Integer company_id;
    private Integer project_id;
    private Integer object_id;
    private String object_code;
    private String object_name;
    private String device_type;
    private String alarm_name;
    private String alarm_level;
    private Float fact_value;
    private String alarm_desc;
    private String reason;
    private Integer work_status;
    private Integer is_normal;
    private Integer his_rule;
    private Integer source;
    private Integer is_push;
    private String alarm_way;
    private Integer confirm_user;
    private String confirm_user_name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date confirm_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date renew_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    private Integer alarm_type;
    private String press_method;
    private Integer reason_tag_id;
    private String device_name;
    private String project_name;
    private Integer alarm_desc_type;
    private String device_path;
    private String short_name;
    private Integer val;//故障数统计
    private String type_name;//故障类型
    //显示层级关系
    private String object_path;
    private String alarm_level_name;
    //新增data_id
    private Integer data_id;
}
