package com.wanghui.ticket.domain.user.model.valobj;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable {
    /** 用户主键ID */
    private Long userId;

    /** 用户名（登录名） */
    private String userName;

    /** 登录密码（加密存储） */
    private String password;

    /** 用户真实姓名（实名购票要求） */
    private String realName;

    /** 身份证号 */
    private String userCardNo;

    /** 手机号 */
    private String userPhone;

    /** 邮箱 */
    private String email;

    /** 用户类型（0：普通用户，1：学生，2：军人等） */
    private Integer userType;

    /** 用户状态（0：正常，1：已封禁，2：已注销） */
    private Integer status;

    /** 注册时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registerTime;
}