package com.ssgh.blog.dao;

import com.ssgh.blog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    int insert(AdminUser record);
    int insertSelective(AdminUser record);
    AdminUser login(@Param("userName") String userName, @Param("password") String password);
    AdminUser selectByPrimaryKey(Integer adminUserId);
    int updateByPrimaryKeySelective(AdminUser record);
    int updateByPrimaryKey(AdminUser record);
}
