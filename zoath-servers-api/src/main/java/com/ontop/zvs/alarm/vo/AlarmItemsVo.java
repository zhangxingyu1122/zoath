package com.ontop.zoath.alarm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/9/18 18:06
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmItemsVo implements Serializable {

    private Integer items_id;
    private Integer alarm_id;
    private Integer order_number;
    private Integer point_data_id;
    private String logical_signal;
    private Float item_value;
    private String next_logical_formula;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
}
