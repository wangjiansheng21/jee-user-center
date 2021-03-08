package org.jee.boot.user.provider.dao.ext;

import org.jee.boot.user.provider.entity.UserInfo;

public interface UserInfoExtDao {

    /**
     *
     * 根据手机号码查询用户基本信息
     * @param phone
     * @return UserInfo
     */
    UserInfo getUserInfoByPhone(String phone);


    /**
     *
     * 根据登录名查询用户信息
     * @param loginName
     * @return UserInfo
     */
    UserInfo getUserInfoByLoginName(String loginName);
}
