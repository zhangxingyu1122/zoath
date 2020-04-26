package com.ontop.zoath.alarm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Describtion:报警信息处理类
 * @Author: yinyl
 * @Date: 2018/11/8 16:31
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmInfoPress implements Serializable {

    private Integer data_id;
    private Integer object_id;
    private Integer parent_id;
    private Integer parent_box_id;
    private Integer company_id;
    private Integer project_id;
    private String object_code;
    private String object_name;
    private String factory;
    private String object_type;
    private String device_type;
    private Integer temp_id;
    private Integer box_id;
    private String box_address;
    private String box_channel;
    private String object_address;
    private String phone_num;
    private String lon;
    private String lat;
    private Integer storage_period;
    private Integer object_status;
    private Integer is_display_map;
    private String description;
    private String hidden_code;
    private Integer is_custom;
    private String object_img;
    private Integer status;
    private Integer create_user_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;

}
