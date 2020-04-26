package com.ontop.zoath.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserinfoDo {
    private Integer user_id;
    private Integer dept_id;
    private String login_name;
    private String user_name;
    private String user_type;
    private String email;
    private String phonenumber;
    private String sex;
    private String avatar;
    private String password;
    private String salt;
    private String status;
    private String del_flag;
    private String login_ip;
    private Date login_date;
    private String create_by;
    private Date create_time;
    private String update_by;
    private Date update_time;
    private String remark;
}
