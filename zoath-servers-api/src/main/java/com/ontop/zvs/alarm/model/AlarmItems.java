package com.ontop.zoath.alarm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Describtion:报警子表实体
 * @Author: yinyl
 * @Date: 2018/10/15 13:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmItems implements Serializable {

    private Integer items_id;
    private Integer alarm_id;
    private Integer order_number;
    private Integer point_data_id;
    private String logical_signal;
    private Float item_value;
    private String next_logical_formula;
    private String real_logical_formula;//所属逻辑
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    private String point_data_name;
    private String data_type;
    private String c_data_type;
}
