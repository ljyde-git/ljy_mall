package cn.net.lijinya.entity.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.net.lijinya.entity.BaseEntity;

/**
 * 用户头像实体 该项目是知识星球：java突击队 的内部项目
 * 
 * @author 李进涯
 * @date 2026-02-05 17:24:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAvatarEntity extends BaseEntity {
	

	/**
	 * 文件名
	 */
	private String fileName;

	/**
	 * 路径
	 */
	private String path;

	/**
	 * 大小
	 */
	private String fileSize;
}
