package com.ontop.zoath.alarm.vo;

import com.ontop.zoath.base.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/9/18 18:06
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmMsgVo extends BaseVo {

    private Integer msg_id;
    private Integer project_id;
    private String device_type;
    private Integer company_id;
    private Integer module_type;
    private Integer object_id;
    private String alarm_level;
    private Integer confirm_user;
    private Date start_time;
    private Date end_time;
    private List<Integer> idList;
    private Integer work_status;
    private String reason;
    private String alarm_type;
    private String press_method;
    private Integer reason_tag_id;
    private String tag_name;
    private String object_name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date confirm_time;
    //新增查询的关键字
    private String key_name;

    //数字孪生显示子集处理
    private Integer showChild; //showChild =0不显示子级；showChild =1显示子级；
    private Set<Integer> objectIdList;
}
