package org.jee.boot.user.provider.dao.ext;

import org.apache.ibatis.annotations.Param;
import org.jee.boot.user.provider.entity.UserThirdAuths;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/10 14:03
 */
public interface UserThirdAuthseExtDao {
    /**
     * 获取第三方授权信息
     *
     * @param identityType 三方授权类型：1=微信，2=qq, 3=weibo 必传
     * @param identifier   第三方系统对应的用户唯一标志（如微信的openId） 必传
     * @return UserThirdAuths
     */
    UserThirdAuths getUserThirdAuthInfo(@Param("identityType") Byte identityType, @Param("identifier") String identifier);
}
