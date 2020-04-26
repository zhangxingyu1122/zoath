package com.ontop.zoath.alarm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description :  描述：对象树
 * @Author :       作者：ttsf
 * @CreateDate :   日期：2019/11/19$ 17:47$
 * @UpdateUser :   更新：
 * @UpdateRemark: 修改：
 * @Version :      版本：1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlarmTreeAppVo {
    private Integer object_id;
    private Integer parent_id;
    private String object_name;
    private Integer company_id;
    private String alarm_count;
    private List<AlarmTreeAppVo> children;
}