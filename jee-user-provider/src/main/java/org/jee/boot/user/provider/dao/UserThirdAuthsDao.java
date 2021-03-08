package org.jee.boot.user.provider.dao;

import org.jee.boot.user.provider.entity.UserThirdAuths;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户第三方授权信息表(UserThirdAuths)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-07 17:11:20
 */
public interface UserThirdAuthsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserThirdAuths queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserThirdAuths> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userThirdAuths 实例对象
     * @return 对象列表
     */
    List<UserThirdAuths> queryAll(UserThirdAuths userThirdAuths);

    /**
     * 新增数据
     *
     * @param userThirdAuths 实例对象
     * @return 影响行数
     */
    int insert(UserThirdAuths userThirdAuths);

    /**
     * 修改数据
     *
     * @param userThirdAuths 实例对象
     * @return 影响行数
     */
    int update(UserThirdAuths userThirdAuths);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}