package org.jee.boot.user.provider.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(UserInfo)实体类
 *
 * @author makejava
 * @since 2021-03-07 19:49:37
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -16833817557134712L;

    private Long id;
    /**
    * 登录账号名（不可以重复）
    */
    private String loginName;
    /**
    * 密码
    */
    private String passWord;
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
    /**
    * 是否删除
    */
    private Byte deleted;

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
    * 性别
    */
    private Byte gender;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

}
