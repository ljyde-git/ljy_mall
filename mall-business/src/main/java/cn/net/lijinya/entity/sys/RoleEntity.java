package cn.net.lijinya.entity.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.net.lijinya.entity.BaseEntity;

/**
 * 角色实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 李进涯
 * @date 2026-02-05 17:24:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleEntity extends BaseEntity {
	

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 数据权限
	 */
	private String dataScope;

	/**
	 * 角色级别
	 */
	private Integer level;

	/**
	 * 功能权限
	 */
	private String permission;
}
