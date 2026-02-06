package cn.net.lijinya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.sys.RoleMenuConditionEntity;
import cn.net.lijinya.entity.sys.RoleMenuEntity;
import cn.net.lijinya.service.RoleMenuService;
import javax.validation.constraints.NotNull;

/**
 * 角色菜单关联 接口层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@RestController
@RequestMapping("/v1/roleMenu")
public class RoleMenuController {
	
	@Autowired
	private RoleMenuService roleMenuService;

	/**
	 * 通过id查询角色菜单关联信息
	 *
	 * @param id 系统ID
	 * @return 角色菜单关联信息
	 */
	@GetMapping("/findById")
	public RoleMenuEntity findById(Long id) {
		return roleMenuService.findById(id);
	}

	/**
    * 根据条件查询角色菜单关联列表
    *
    * @param roleMenuConditionEntity 条件
    * @return 角色菜单关联列表
    */
	@PostMapping("/searchByPage")
	public ResponsePageEntity<RoleMenuEntity> searchByPage(@RequestBody RoleMenuConditionEntity roleMenuConditionEntity) {
		return roleMenuService.searchByPage(roleMenuConditionEntity);
	}


	/**
     * 添加角色菜单关联
     *
     * @param roleMenuEntity 角色菜单关联实体
     * @return 影响行数
     */
	@PostMapping("/insert")
	public int insert(@RequestBody RoleMenuEntity roleMenuEntity) {
		return roleMenuService.insert(roleMenuEntity);
	}

	/**
     * 修改角色菜单关联
     *
     * @param roleMenuEntity 角色菜单关联实体
     * @return 影响行数
     */
	@PostMapping("/update")
	public int update(@RequestBody RoleMenuEntity roleMenuEntity) {
		return roleMenuService.update(roleMenuEntity);
	}

	/**
     * 删除角色菜单关联
     *
     * @param id 角色菜单关联ID
     * @return 影响行数
     */
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return roleMenuService.deleteById(id);
	}
}
