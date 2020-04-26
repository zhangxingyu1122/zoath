package com.ontop.zoath.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 描述：返回基础数据
 * @Author: 作者：ttsf
 * @Date: 日期：2019/11/25 10:44
 * @updata: 更新：
 * @Param: 参数： * @param null :
 * @return: 返回值：
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseDo implements Serializable {
    private String token;
}
