package org.jee.boot.user.provider.service;

import org.jee.boot.user.provider.entity.UserThirdAuths;
import java.util.List;

/**
 * 用户第三方授权信息表(UserThirdAuths)表服务接口
 *
 * @author makejava
 * @since 2021-03-07 17:11:20
 */
public interface UserThirdAuthsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserThirdAuths queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserThirdAuths> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userThirdAuths 实例对象
     * @return 实例对象
     */
    UserThirdAuths insert(UserThirdAuths userThirdAuths);

    /**
     * 修改数据
     *
     * @param userThirdAuths 实例对象
     * @return 实例对象
     */
    UserThirdAuths update(UserThirdAuths userThirdAuths);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}