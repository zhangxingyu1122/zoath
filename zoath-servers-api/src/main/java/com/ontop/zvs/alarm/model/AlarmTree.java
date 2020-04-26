package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description :  描述：
 * @Author :  作者：zxy
 * @CreateDate :  日期：2019/10/23$ 17:44$
 * @UpdateUser :  更新：
 * @UpdateRemark: 修改：
 * @Version :  版本：1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmTree {
    private Integer object_id;
    private Integer parent_id;
    private String object_name;
    private Integer company_id;
    private String object_path;
    private List<AlarmTree> children;

    //报警数量查询
    private Integer alarm_count;
}