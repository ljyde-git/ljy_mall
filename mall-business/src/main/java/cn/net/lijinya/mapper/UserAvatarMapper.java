package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.UserAvatarConditionEntity;
import cn.net.lijinya.entity.UserAvatarEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户头像 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface UserAvatarMapper {
	/**
     * 查询用户头像信息
     * 
     * @param id 用户头像ID
     * @return 用户头像信息
     */
	UserAvatarEntity findById(Long id);
	
	/**
     * 根据条件查询用户头像列表
     *
     * @param userAvatarConditionEntity 用户头像信息
     * @return 用户头像集合
     */
	List<UserAvatarEntity> searchByCondition(UserAvatarConditionEntity userAvatarConditionEntity);

	/**
	 * 根据条件查询用户头像数量
	 *
	 * @param userAvatarConditionEntity 用户头像信息
	 * @return 用户头像集合
	 */
	int searchCount(UserAvatarConditionEntity userAvatarConditionEntity);
	
	/**
     * 添加用户头像
     * 
     * @param userAvatarEntity 用户头像信息
     * @return 结果
     */
	int insert(UserAvatarEntity userAvatarEntity);
	
	/**
     * 修改用户头像
     * 
     * @param userAvatarEntity 用户头像信息
     * @return 结果
     */
	int update(UserAvatarEntity userAvatarEntity);
	
	/**
     * 删除用户头像
     * 
     * @param id 用户头像ID
     * @return 结果
     */
	int deleteById(Long id);
	
}