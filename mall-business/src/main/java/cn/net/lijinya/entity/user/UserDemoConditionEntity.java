package cn.net.lijinya.entity.user;

import cn.net.lijinya.entity.RequestPageEntity;
import lombok.Data;

/**
 * 用户条件实体类
 */
@Data
public class UserDemoConditionEntity extends RequestPageEntity {
    /**
     * 系统ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;

}