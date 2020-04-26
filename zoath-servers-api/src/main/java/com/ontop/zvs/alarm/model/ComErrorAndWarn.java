package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 描述：报警公共信息
 * @Author: 作者：ttsf
 * @Date: 日期：2019/9/19 17:01
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComErrorAndWarn implements Serializable {
    /**
     * @describe 总数量
     */
    private Integer total;
    /**
     * @describe 报警信息主键
     */
    private Integer alarm_id;
    /**
     * @describe 报警名称
     */
    private String alarm_name;

}
