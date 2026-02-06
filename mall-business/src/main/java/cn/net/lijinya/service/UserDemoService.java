package cn.net.lijinya.service;

import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.user.UserDemoConditionEntity;
import cn.net.lijinya.entity.user.UserDemoEntity;
import cn.net.lijinya.mapper.UserDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDemoService {

    @Autowired
    private UserDemoMapper userMapper;

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
    public UserDemoEntity findById(Long id) {
        return userMapper.findById(id);
    }

    /**
     * 根据条件查询用户列表
     *
     * @param userDemoConditionEntity 条件
     * @return 用户列表
     */
    public ResponsePageEntity<UserDemoEntity> searchByPage(UserDemoConditionEntity userDemoConditionEntity) {
        int count = userMapper.searchCount(userDemoConditionEntity);
        if (count == 0) {
            return ResponsePageEntity.buildEmpty(userDemoConditionEntity);
        }
        List<UserDemoEntity> userEntities = userMapper.searchByCondition(userDemoConditionEntity);
        return ResponsePageEntity.build(userDemoConditionEntity, count, userEntities);
    }


    /**
     * 添加用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    public int insert(UserDemoEntity userDemoEntity) {
        return userMapper.insert(userDemoEntity);
    }

    /**
     * 修改用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    public int update(UserDemoEntity userDemoEntity) {
        return userMapper.update(userDemoEntity);
    }

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }
}
