package cn.net.lijinya.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    /**
     * 用户名称
     */
    private String userName;
}
