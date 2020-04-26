package com.ontop.zoath.alarm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description :  描述：故障+ 告警实体
 * @Author :       作者：ttsf
 * @CreateDate :   日期：2019/11/19$ 14:50$
 * @UpdateUser :   更新：
 * @UpdateRemark: 修改：
 * @Version :      版本：1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmNumVo {
    private Integer msg_id;
    private Integer module_type;
    private Integer alarm_id;
    private Integer alarm_type;
    private Integer company_id;
    private Integer object_id;
    private String object_code;
    private String alarm_level;
    private Integer data_id;
}