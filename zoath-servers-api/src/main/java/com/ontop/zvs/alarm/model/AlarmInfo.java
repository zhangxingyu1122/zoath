package com.ontop.zoath.alarm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ontop.zoath.base.BaseVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmInfo extends BaseVo implements Serializable {

    private Integer alarm_id;
    private Integer module_type;
    private String alarm_name;
    private Integer object_id;
    private String object_code;
    private String object_name;
    private String alarm_level;
    private String description;
    private Integer project_id;
    private String formula;
    private String alarm_way;
    private Integer alarm_type;
    private Integer status;
    private Integer his_rule;
    private Integer create_user_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    private String alarm_type_name;
    private LinkedList<AlarmItems> alarmItemsList;
}
