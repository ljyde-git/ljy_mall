package cn.net.lijinya.entity.sys;

import cn.net.lijinya.entity.RequestPageEntity;
import lombok.Data;

import java.util.Date;

/**
 * 用户查询条件实体
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Data
public class UserConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	private Long id;

	/**
	 *  头像
     */
	private Long avatarId;

	/**
	 *  邮箱
     */
	private String email;

	/**
	 *  密码
     */
	private String password;

	/**
	 *  用户名
     */
	private String userName;

	/**
	 *  部门ID
     */
	private Long deptId;

	/**
	 *  手机号码
     */
	private String phone;

	/**
	 *  岗位ID
     */
	private Long jobId;

	/**
	 *  最后修改密码的时间
     */
	private Date lastChangePasswordTime;

	/**
	 *  别名
     */
	private String nickName;

	/**
	 *  性别 1：男 2：女
     */
	private Integer sex;

	/**
	 *  有效状态 1:有效 0:无效
     */
	private Integer validStatus;

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
