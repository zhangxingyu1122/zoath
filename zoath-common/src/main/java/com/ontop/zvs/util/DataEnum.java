package com.ontop.zoath.util;

/**
 * 数据类型枚举类
 *
 * @ylyin
 */
public enum DataEnum {
    //--------------------------日期枚举 日 周 月 年-----------------------------------------------------------
    DAY("0", "日"),

    WEEK("1", "周"),

    MONTH("2", "月"),

    YEAR("3", "年"),
    //--------------------------设备医生-设备状态------------------------------------------------
    DEVICE_STATUS_0("0", "未知"),

    DEVICE_STATUS_1("1", "工作"),

    DEVICE_STATUS_2("2", "待机"),

    DEVICE_STATUS_3("3", "停机"),

    DEVICE_STATUS_4("4", "故障"),

    DEVICE_STATUS_5("5", "调试");
    //----------------------------------------------------------------------------------------------


    private String value;
    private String desc;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private DataEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
