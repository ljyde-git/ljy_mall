package cn.net.lijinya.entity.sys;

import cn.net.lijinya.entity.RequestPageEntity;
import lombok.Data;

import java.util.Date;

/**
 * 角色查询条件实体
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Data
public class RoleConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	private Long id;

	/**
	 *  名称
     */
	private String name;

	/**
	 *  备注
     */
	private String remark;

	/**
	 *  数据权限
     */
	private String dataScope;

	/**
	 *  角色级别
     */
	private Integer level;

	/**
	 *  功能权限
     */
	private String permission;

	/**
	 *  创建人ID
     */
	private Long createUserId;

	/**
	 *  创建人名称
     */
	private String createUserName;

	/**
	 *  创建日期
     */
	private Date createTime;

	/**
	 *  修改人ID
     */
	private Long updateUserId;

	/**
	 *  修改人名称
     */
	private String updateUserName;

	/**
	 *  修改时间
     */
	private Date updateTime;

	/**
	 *  是否删除 1：已删除 0：未删除
     */
	private Integer isDel;
}
