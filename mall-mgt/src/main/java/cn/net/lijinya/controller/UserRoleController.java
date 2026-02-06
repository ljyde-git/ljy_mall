package cn.net.lijinya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.sys.UserRoleConditionEntity;
import cn.net.lijinya.entity.sys.UserRoleEntity;
import cn.net.lijinya.service.UserRoleService;
import javax.validation.constraints.NotNull;

/**
 * 用户角色关联 接口层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@RestController
@RequestMapping("/v1/userRole")
public class UserRoleController {
	
	@Autowired
	private UserRoleService userRoleService;

	/**
	 * 通过id查询用户角色关联信息
	 *
	 * @param id 系统ID
	 * @return 用户角色关联信息
	 */
	@GetMapping("/findById")
	public UserRoleEntity findById(Long id) {
		return userRoleService.findById(id);
	}

	/**
    * 根据条件查询用户角色关联列表
    *
    * @param userRoleConditionEntity 条件
    * @return 用户角色关联列表
    */
	@PostMapping("/searchByPage")
	public ResponsePageEntity<UserRoleEntity> searchByPage(@RequestBody UserRoleConditionEntity userRoleConditionEntity) {
		return userRoleService.searchByPage(userRoleConditionEntity);
	}


	/**
     * 添加用户角色关联
     *
     * @param userRoleEntity 用户角色关联实体
     * @return 影响行数
     */
	@PostMapping("/insert")
	public int insert(@RequestBody UserRoleEntity userRoleEntity) {
		return userRoleService.insert(userRoleEntity);
	}

	/**
     * 修改用户角色关联
     *
     * @param userRoleEntity 用户角色关联实体
     * @return 影响行数
     */
	@PostMapping("/update")
	public int update(@RequestBody UserRoleEntity userRoleEntity) {
		return userRoleService.update(userRoleEntity);
	}

	/**
     * 删除用户角色关联
     *
     * @param id 用户角色关联ID
     * @return 影响行数
     */
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return userRoleService.deleteById(id);
	}
}
