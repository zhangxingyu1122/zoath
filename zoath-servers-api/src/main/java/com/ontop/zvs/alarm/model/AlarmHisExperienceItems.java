package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/9/18 18:07
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlarmHisExperienceItems implements Serializable {
    // 报警时间：
    private Date alarm_time;
    //处理人
    private String user_name;
    //报警原因
    private String alarm_reason;
    //处理方法
    private String press_method;

    //持续时间
    private Long keep_time;
    //是否确认
    private Integer is_confirm;

    //新增加历史经验信息
    private String alarm_info_desc;  //报警的基本信息描述 ;
    private String alarm_info_value;  //报警的基本信息值 ;
    private String alarm_info_express;  //报警的基本信息表达式;

}
