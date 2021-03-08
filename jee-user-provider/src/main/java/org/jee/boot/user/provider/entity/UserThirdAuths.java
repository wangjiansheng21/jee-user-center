package org.jee.boot.user.provider.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户第三方授权信息表(UserThirdAuths)实体类
 *
 * @author makejava
 * @since 2021-03-07 17:11:18
 */
public class UserThirdAuths implements Serializable {
    private static final long serialVersionUID = -78054933199927064L;
    
    private Long id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 三方授权类型：1=微信，2=qq, 3=weibo
    */
    private Object identityType;
    /**
    * 第三方系统对应的用户唯一标志（如微信的openId）
    */
    private String identifier;
    
    private Date createdTime;
    
    private Date updatedTime;
    
    private Long version;
    
    private Object deleted;


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

    public Object getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Object identityType) {
        this.identityType = identityType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

}