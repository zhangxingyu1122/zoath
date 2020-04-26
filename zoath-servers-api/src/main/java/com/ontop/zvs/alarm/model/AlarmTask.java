package com.ontop.zoath.alarm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlarmTask implements Serializable {

    private Integer id;
    private Integer alarm_id;
    private Date create_time;
}
