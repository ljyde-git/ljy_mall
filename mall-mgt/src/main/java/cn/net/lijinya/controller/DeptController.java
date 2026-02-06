package cn.net.lijinya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.net.lijinya.entity.ResponsePageEntity;
import cn.net.lijinya.entity.DeptConditionEntity;
import cn.net.lijinya.entity.DeptEntity;
import cn.net.lijinya.service.DeptService;
import javax.validation.constraints.NotNull;

/**
 * 部门 接口层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@RestController
@RequestMapping("/v1/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	/**
	 * 通过id查询部门信息
	 *
	 * @param id 系统ID
	 * @return 部门信息
	 */
	@GetMapping("/findById")
	public DeptEntity findById(Long id) {
		return deptService.findById(id);
	}

	/**
    * 根据条件查询部门列表
    *
    * @param deptConditionEntity 条件
    * @return 部门列表
    */
	@PostMapping("/searchByPage")
	public ResponsePageEntity<DeptEntity> searchByPage(@RequestBody DeptConditionEntity deptConditionEntity) {
		return deptService.searchByPage(deptConditionEntity);
	}


	/**
     * 添加部门
     *
     * @param deptEntity 部门实体
     * @return 影响行数
     */
	@PostMapping("/insert")
	public int insert(@RequestBody DeptEntity deptEntity) {
		return deptService.insert(deptEntity);
	}

	/**
     * 修改部门
     *
     * @param deptEntity 部门实体
     * @return 影响行数
     */
	@PostMapping("/update")
	public int update(@RequestBody DeptEntity deptEntity) {
		return deptService.update(deptEntity);
	}

	/**
     * 删除部门
     *
     * @param id 部门ID
     * @return 影响行数
     */
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return deptService.deleteById(id);
	}
}
