package cn.net.lijinya.entity.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.net.lijinya.entity.BaseEntity;

/**
 * 岗位实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 李进涯
 * @date 2026-02-05 17:24:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobEntity extends BaseEntity {
	

	/**
	 * 岗位名称
	 */
	private String name;

	/**
	 * 岗位排序
	 */
	private Integer sort;

	/**
	 * 部门ID
	 */
	private Long deptId;

	/**
	 * 有效状态 1:有效 0:无效
	 */
	private Integer validStatus;
}
