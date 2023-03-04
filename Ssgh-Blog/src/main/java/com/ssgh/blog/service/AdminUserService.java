package com.ssgh.blog.service;

import com.ssgh.blog.entity.AdminUser;

public interface AdminUserService {

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(String userName, String password);

    /**
     *
     * @param loginUserId
     * @return
     */
    AdminUser getUserDetailById(Integer loginUserId);

    /**
     *
     * @param loginUserId
     * @param originalPassword
     * @param newPassword
     * @return
     */
    Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);

    /**
     *
     * @param loginUserId
     * @param loginUserName
     * @param nickName
     * @return
     */
    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);
}
