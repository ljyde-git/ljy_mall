package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.user.UserDemoConditionEntity;
import cn.net.lijinya.entity.user.UserDemoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDemoMapper {

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
    UserDemoEntity findById(Long id);

    /**
     * 根据条件查询用户列表
     *
     * @param userDemoConditionEntity 条件
     * @return 用户列表
     */
    List<UserDemoEntity> searchByCondition(UserDemoConditionEntity userDemoConditionEntity);

    /**
     * 根据条件查询用户数量
     *
     * @param userDemoConditionEntity 条件
     * @return 用户列表
     */
    int searchCount(UserDemoConditionEntity userDemoConditionEntity);

    /**
     * 添加用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    int insert(UserDemoEntity userDemoEntity);

    /**
     * 修改用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    int update(UserDemoEntity userDemoEntity);

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
    int deleteById(Long id);
}