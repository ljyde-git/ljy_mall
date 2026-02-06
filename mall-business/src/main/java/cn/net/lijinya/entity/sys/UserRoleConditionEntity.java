package cn.net.lijinya.entity.sys;

import cn.net.lijinya.entity.RequestPageEntity;
import lombok.Data;

/**
 * 用户角色关联查询条件实体
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Data
public class UserRoleConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	private Long id;

	/**
	 *  用户ID
     */
	private Long userId;

	/**
	 *  角色ID
     */
	private Long roleId;
}
