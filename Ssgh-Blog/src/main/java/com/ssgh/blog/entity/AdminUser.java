package com.ssgh.blog.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdminUser {
    private Integer adminUserId;
    private String loginUserName;
    private String loginUserPassword;
    private String nickName;
    private Byte locked;
}
