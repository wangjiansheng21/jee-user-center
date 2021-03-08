package org.jee.boot.user.provider.service;

import org.jee.boot.user.provider.entity.UserInfo;
import java.util.List;

/**
 * 用户信息表(UserInfo)表服务接口
 *
 * @author makejava
 * @since 2021-03-07 17:11:04
 */
public interface UserInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 根据手机号码查询用户信息
     * @param phone
     * @return
     */
    UserInfo getUserInfoByPhone(String phone);

    /**
     *
     * 根据登录名查询用户信息
     * @param loginName
     * @return
     */
    UserInfo getUserInfoByLoginName(String loginName);
}
