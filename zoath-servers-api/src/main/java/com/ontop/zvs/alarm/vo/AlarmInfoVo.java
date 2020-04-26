package com.ontop.zoath.alarm.vo;


import com.ontop.zoath.base.BaseVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: 描述：
 * @Author: 作者：ttsf
 * @Date: 日期：2019/9/18 18:05
 * @updata: 更新：
 * @Param: 参数：
 * @return: 返回值：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlarmInfoVo extends BaseVo {
    private Integer module_type;
    private String alarm_name;
    private String object_code;
    private Integer create_user_id;
    private Integer object_id;
    private String alarm_level;
}
