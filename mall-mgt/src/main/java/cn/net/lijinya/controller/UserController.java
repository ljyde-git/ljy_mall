package cn.net.lijinya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.sys.UserConditionEntity;
import cn.net.lijinya.entity.sys.UserEntity;
import cn.net.lijinya.service.UserService;
import javax.validation.constraints.NotNull;

/**
 * 用户 接口层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 通过id查询用户信息
	 *
	 * @param id 系统ID
	 * @return 用户信息
	 */
	@GetMapping("/findById")
	public UserEntity findById(Long id) {
		return userService.findById(id);
	}

	/**
    * 根据条件查询用户列表
    *
    * @param userConditionEntity 条件
    * @return 用户列表
    */
	@PostMapping("/searchByPage")
	public ResponsePageEntity<UserEntity> searchByPage(@RequestBody UserConditionEntity userConditionEntity) {
		return userService.searchByPage(userConditionEntity);
	}


	/**
     * 添加用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
	@PostMapping("/insert")
	public int insert(@RequestBody UserEntity userEntity) {
		return userService.insert(userEntity);
	}

	/**
     * 修改用户
     *
     * @param userEntity 用户实体
     * @return 影响行数
     */
	@PostMapping("/update")
	public int update(@RequestBody UserEntity userEntity) {
		return userService.update(userEntity);
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
