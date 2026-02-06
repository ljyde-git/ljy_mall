package cn.net.lijinya.entity.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.net.lijinya.entity.BaseEntity;

/**
 * 角色部门关联实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 李进涯
 * @date 2026-02-05 17:24:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDeptEntity extends BaseEntity {
	

	/**
	 * 
	 */
	private Long roleId;

	/**
	 * 
	 */
	private Long deptId;
}
