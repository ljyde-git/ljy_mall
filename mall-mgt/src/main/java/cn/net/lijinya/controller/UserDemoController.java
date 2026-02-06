package cn.net.lijinya.controller;

import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.user.UserDemoConditionEntity;
import cn.net.lijinya.entity.user.UserDemoEntity;
import cn.net.lijinya.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/user")
public class UserDemoController {

    @Autowired
    private UserDemoService userService;

    /**
     * 通过id查询用户信息
     *
     * @param id 系统ID
     * @return 用户信息
     */
    @GetMapping("/findById")
    public UserDemoEntity findById(Long id) {
        return userService.findById(id);
    }

    /**
     * 根据条件查询用户列表
     *
     * @param userDemoConditionEntity 条件
     * @return 用户列表
     */
    @PostMapping("/searchByPage")
    public ResponsePageEntity<UserDemoEntity> searchByPage(@RequestBody UserDemoConditionEntity userDemoConditionEntity) {
        return userService.searchByPage(userDemoConditionEntity);
    }


    /**
     * 添加用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    @PostMapping("/insert")
    public int insert(@RequestBody UserDemoEntity userDemoEntity) {
        return userService.insert(userDemoEntity);
    }

    /**
     * 修改用户
     *
     * @param userDemoEntity 用户实体
     * @return 影响行数
     */
    @PostMapping("/update")
    public int update(@RequestBody UserDemoEntity userDemoEntity) {
        return userService.update(userDemoEntity);
    }

    /**
     * 删除用户
     *
     * @param id 用户ID
     * @return 影响行数
     */
    @PostMapping("/deleteById")
    public int deleteById(@RequestBody @NotNull Long id) {
        return userService.deleteById(id);
    }
}
