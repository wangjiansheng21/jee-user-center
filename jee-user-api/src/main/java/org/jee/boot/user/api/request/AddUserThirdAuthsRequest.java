package org.jee.boot.user.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/10 14:17
 */
@Data
public class AddUserThirdAuthsRequest implements Serializable {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 三方授权类型：1=微信，2=qq, 3=weibo
     */
    private Byte identityType;
    /**
     * 第三方系统对应的用户唯一标志（如微信的openId）
     */
    private String identifier;
}
