package cn.net.lijinya.entity;

import lombok.Data;

/**
 * 用户条件实体类
 */
@Data
public class UserConditionEntity {
    private String username;
    private String email;
    private Integer age;
    private String phone;

}