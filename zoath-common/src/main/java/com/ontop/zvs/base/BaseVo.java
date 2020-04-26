package com.ontop.zoath.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 描述：基础数据
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 9:31
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseVo implements Serializable {

    private Integer company_id;
    private String token;
    private Integer pageNum;
    private Integer pageSize;
    private String orderField;//排序的字段
    private String orderType;//排序的规则 [ASC,DESC]
    //新增参数app专用参数
    private Integer version_code;
    private String key_name;//关键字查询
}
