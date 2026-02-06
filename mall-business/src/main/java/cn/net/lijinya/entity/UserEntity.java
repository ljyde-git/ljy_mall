package cn.net.lijinya.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.net.lijinya.entity.BaseEntity;
import java.util.Date;

/**
 * 用户实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 李进涯
 * @date 2026-02-05 17:24:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity extends BaseEntity {
	

	/**
	 * 头像
	 */
	private Long avatarId;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 部门ID
	 */
	private Long deptId;

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 岗位ID
	 */
	private Long jobId;

	/**
	 * 最后修改密码的时间
	 */
	private Date lastChangePasswordTime;

	/**
	 * 别名
	 */
	private String nickName;

	/**
	 * 性别 1：男 2：女
	 */
	private Integer sex;

	/**
	 * 有效状态 1:有效 0:无效
	 */
	private Integer validStatus;
}
