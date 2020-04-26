package com.ontop.zoath.util;

/**
 * @Description :  描述：
 * @Author :  作者：zxy
 * @CreateDate :  日期：2019/7/23$ 11:50$
 * @UpdateUser :  更新：
 * @UpdateRemark: 修改：
 * @Version :  版本：1.0
 */

public enum ColorEnum {

    //设备颜色枚举类
    COLOR_STATUS_0("#1EAB8F"),
    COLOR_STATUS_1("#22D2FD"),
    COLOR_STATUS_2("#FFC000"),
    COLOR_STATUS_3("#828DA2"),
    COLOR_STATUS_4("#FF6023"),
    COLOR_STATUS_5("#0576FE");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private ColorEnum(String value) {
        this.value = value;
    }
}