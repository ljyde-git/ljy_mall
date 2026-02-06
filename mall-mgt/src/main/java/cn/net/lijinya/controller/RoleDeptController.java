package cn.net.lijinya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.sys.RoleDeptConditionEntity;
import cn.net.lijinya.entity.sys.RoleDeptEntity;
import cn.net.lijinya.service.RoleDeptService;
import javax.validation.constraints.NotNull;

/**
 * 角色部门关联 接口层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@RestController
@RequestMapping("/v1/roleDept")
public class RoleDeptController {
	
	@Autowired
	private RoleDeptService roleDeptService;

	/**
	 * 通过id查询角色部门关联信息
	 *
	 * @param id 系统ID
	 * @return 角色部门关联信息
	 */
	@GetMapping("/findById")
	public RoleDeptEntity findById(Long id) {
		return roleDeptService.findById(id);
	}

	/**
    * 根据条件查询角色部门关联列表
    *
    * @param roleDeptConditionEntity 条件
    * @return 角色部门关联列表
    */
	@PostMapping("/searchByPage")
	public ResponsePageEntity<RoleDeptEntity> searchByPage(@RequestBody RoleDeptConditionEntity roleDeptConditionEntity) {
		return roleDeptService.searchByPage(roleDeptConditionEntity);
	}


	/**
     * 添加角色部门关联
     *
     * @param roleDeptEntity 角色部门关联实体
     * @return 影响行数
     */
	@PostMapping("/insert")
	public int insert(@RequestBody RoleDeptEntity roleDeptEntity) {
		return roleDeptService.insert(roleDeptEntity);
	}

	/**
     * 修改角色部门关联
     *
     * @param roleDeptEntity 角色部门关联实体
     * @return 影响行数
     */
	@PostMapping("/update")
	public int update(@RequestBody RoleDeptEntity roleDeptEntity) {
		return roleDeptService.update(roleDeptEntity);
	}

	/**
     * 删除角色部门关联
     *
     * @param id 角色部门关联ID
     * @return 影响行数
     */
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return roleDeptService.deleteById(id);
	}
}
