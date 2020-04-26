package com.ontop.zoath.alarm.vo;


import com.ontop.zoath.base.BaseVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 设备监控-综合故障
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComErrorAndWarnVo extends BaseVo {
    private String alarm_level;
    private String date_period;
    private Integer object_id;
    private Integer company_id;
    private Date start_time;
    private Date end_time;
    private Integer limit;
}
