package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.UserRoleConditionEntity;
import cn.net.lijinya.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户角色关联 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface UserRoleMapper {
	/**
     * 查询用户角色关联信息
     * 
     * @param id 用户角色关联ID
     * @return 用户角色关联信息
     */
	UserRoleEntity findById(Long id);
	
	/**
     * 根据条件查询用户角色关联列表
     *
     * @param userRoleConditionEntity 用户角色关联信息
     * @return 用户角色关联集合
     */
	List<UserRoleEntity> searchByCondition(UserRoleConditionEntity userRoleConditionEntity);

	/**
	 * 根据条件查询用户角色关联数量
	 *
	 * @param userRoleConditionEntity 用户角色关联信息
	 * @return 用户角色关联集合
	 */
	int searchCount(UserRoleConditionEntity userRoleConditionEntity);
	
	/**
     * 添加用户角色关联
     * 
     * @param userRoleEntity 用户角色关联信息
     * @return 结果
     */
	int insert(UserRoleEntity userRoleEntity);
	
	/**
     * 修改用户角色关联
     * 
     * @param userRoleEntity 用户角色关联信息
     * @return 结果
     */
	int update(UserRoleEntity userRoleEntity);
	
	/**
     * 删除用户角色关联
     * 
     * @param id 用户角色关联ID
     * @return 结果
     */
	int deleteById(Long id);
	
}