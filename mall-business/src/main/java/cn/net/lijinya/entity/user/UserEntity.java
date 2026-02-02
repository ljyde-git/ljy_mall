package cn.net.lijinya.entity.user;

import cn.net.lijinya.entity.BaseEntity;
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
