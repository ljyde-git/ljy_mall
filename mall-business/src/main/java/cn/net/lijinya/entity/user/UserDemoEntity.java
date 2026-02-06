package cn.net.lijinya.entity.user;

import cn.net.lijinya.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDemoEntity extends BaseEntity {

    /**
     * 用户名称
     */
    private String userName;
}
