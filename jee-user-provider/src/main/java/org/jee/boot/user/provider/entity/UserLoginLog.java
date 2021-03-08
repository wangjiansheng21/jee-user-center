package org.jee.boot.user.provider.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserLoginLog)实体类
 *
 * @author makejava
 * @since 2021-03-07 17:10:20
 */
public class UserLoginLog implements Serializable {
    private static final long serialVersionUID = 796948413660789525L;
    
    private Long id;
    
    private Long userId;
    
    private Date loginTime;
    
    private String loginIp;
    /**
    * 登录来源0=pc,1=app,2=wx
    */
    private Object loginSource;
    
    private String loginContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Object getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(Object loginSource) {
        this.loginSource = loginSource;
    }

    public String getLoginContent() {
        return loginContent;
    }

    public void setLoginContent(String loginContent) {
        this.loginContent = loginContent;
    }

}