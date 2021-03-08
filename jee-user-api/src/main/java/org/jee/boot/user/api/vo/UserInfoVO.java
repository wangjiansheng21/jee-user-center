package org.jee.boot.user.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息
 */
@Data
public class UserInfoVO  implements Serializable {
    private Long userId;
    /**
     * 登录账号名（不可以重复）
     */
    private String loginName;

    /**
     * 姓名，如张三
     */
    private String userName;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像地址相对路径
     */
    private String avatar;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;

    private Date createdTime;

    private Date updatedTime;
    /**
     * 版本号（乐观锁使用）
     */
    private Long version;

    private String registerIp;
    /**
     * 最近一次登录时间
     */
    private Date loginTime;
    /**
     * 最近一次登录ip
     */
    private String loginIp;
    /**
     * 用户状态1=正常，2=冻结，3=注销
     */
    private Byte userStatus;
    /**
     * 性别 1=男，2=女，3=未知
     */
    private Byte gender;
}
