package cn.net.lijinya.entity;

import lombok.Data;
import cn.net.lijinya.entity.RequestPageEntity;

/**
 * 角色菜单关联查询条件实体
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Data
public class RoleMenuConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	private Long id;

	/**
	 *  角色ID
     */
	private Long roleId;

	/**
	 *  菜单ID
     */
	private Long menuId;
}
