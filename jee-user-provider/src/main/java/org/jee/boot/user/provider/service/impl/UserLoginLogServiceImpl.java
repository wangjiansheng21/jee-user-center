package org.jee.boot.user.provider.service.impl;

import org.jee.boot.user.provider.entity.UserLoginLog;
import org.jee.boot.user.provider.dao.UserLoginLogDao;
import org.jee.boot.user.provider.service.UserLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2021-03-07 17:10:22
 */
@Service("userLoginLogService")
public class UserLoginLogServiceImpl implements UserLoginLogService {
    @Resource
    private UserLoginLogDao userLoginLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserLoginLog queryById(Long id) {
        return this.userLoginLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserLoginLog> queryAllByLimit(int offset, int limit) {
        return this.userLoginLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UserLoginLog insert(UserLoginLog userLoginLog) {
        this.userLoginLogDao.insert(userLoginLog);
        return userLoginLog;
    }

    /**
     * 修改数据
     *
     * @param userLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UserLoginLog update(UserLoginLog userLoginLog) {
        this.userLoginLogDao.update(userLoginLog);
        return this.queryById(userLoginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userLoginLogDao.deleteById(id) > 0;
    }
}