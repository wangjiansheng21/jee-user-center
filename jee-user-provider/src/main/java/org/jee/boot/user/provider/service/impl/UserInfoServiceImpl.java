package org.jee.boot.user.provider.service.impl;

import org.jee.boot.user.provider.dao.ext.UserInfoExtDao;
import org.jee.boot.user.provider.entity.UserInfo;
import org.jee.boot.user.provider.dao.UserInfoDao;
import org.jee.boot.user.provider.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表(UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-03-07 17:11:04
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Resource
    UserInfoExtDao userInfoExtDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserInfo queryById(Long id) {
        return this.userInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserInfo> queryAllByLimit(int offset, int limit) {
        return this.userInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo insert(UserInfo userInfo) {
        this.userInfoDao.insert(userInfo);
        return userInfo;
    }

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo update(UserInfo userInfo) {
        this.userInfoDao.update(userInfo);
        return this.queryById(userInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userInfoDao.deleteById(id) > 0;
    }

    /**
     *
     * 根据手机号码查询用户基本信息
     * @param phone
     * @return UserInfo
     */
    @Override
    public UserInfo getUserInfoByPhone(String phone) {
        return userInfoExtDao.getUserInfoByPhone(phone);
    }

    /**
     *
     * 根据登录名查询用户信息
     * @param loginName
     * @return UserInfo
     */
    @Override
    public UserInfo getUserInfoByLoginName(String loginName) {
        return userInfoExtDao.getUserInfoByLoginName(loginName);
    }
}
