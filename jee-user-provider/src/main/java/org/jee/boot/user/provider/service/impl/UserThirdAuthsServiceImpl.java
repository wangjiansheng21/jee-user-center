package org.jee.boot.user.provider.service.impl;

import org.jee.boot.user.provider.entity.UserThirdAuths;
import org.jee.boot.user.provider.dao.UserThirdAuthsDao;
import org.jee.boot.user.provider.service.UserThirdAuthsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户第三方授权信息表(UserThirdAuths)表服务实现类
 *
 * @author makejava
 * @since 2021-03-07 17:11:20
 */
@Service("userThirdAuthsService")
public class UserThirdAuthsServiceImpl implements UserThirdAuthsService {
    @Resource
    private UserThirdAuthsDao userThirdAuthsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserThirdAuths queryById(Long id) {
        return this.userThirdAuthsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserThirdAuths> queryAllByLimit(int offset, int limit) {
        return this.userThirdAuthsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userThirdAuths 实例对象
     * @return 实例对象
     */
    @Override
    public UserThirdAuths insert(UserThirdAuths userThirdAuths) {
        this.userThirdAuthsDao.insert(userThirdAuths);
        return userThirdAuths;
    }

    /**
     * 修改数据
     *
     * @param userThirdAuths 实例对象
     * @return 实例对象
     */
    @Override
    public UserThirdAuths update(UserThirdAuths userThirdAuths) {
        this.userThirdAuthsDao.update(userThirdAuths);
        return this.queryById(userThirdAuths.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userThirdAuthsDao.deleteById(id) > 0;
    }
}