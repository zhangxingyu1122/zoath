package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Describtion:实时报警实体类
 * @Author: yinyl
 * @Date: 2018/10/23 17:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmMsgStatus implements Serializable {

    private Integer alarm_id;
    private Integer company_id;
    private Integer work_status;
    private Integer is_normal;
    private Integer his_rule;
}
