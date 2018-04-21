package com.envprotection.system.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.util.Date;
@Alias("User")
@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginDate;
}