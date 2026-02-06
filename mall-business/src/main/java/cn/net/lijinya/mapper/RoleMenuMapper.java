package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.RoleMenuConditionEntity;
import cn.net.lijinya.entity.RoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色菜单关联 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface RoleMenuMapper {
	/**
     * 查询角色菜单关联信息
     * 
     * @param id 角色菜单关联ID
     * @return 角色菜单关联信息
     */
	RoleMenuEntity findById(Long id);
	
	/**
     * 根据条件查询角色菜单关联列表
     *
     * @param roleMenuConditionEntity 角色菜单关联信息
     * @return 角色菜单关联集合
     */
	List<RoleMenuEntity> searchByCondition(RoleMenuConditionEntity roleMenuConditionEntity);

	/**
	 * 根据条件查询角色菜单关联数量
	 *
	 * @param roleMenuConditionEntity 角色菜单关联信息
	 * @return 角色菜单关联集合
	 */
	int searchCount(RoleMenuConditionEntity roleMenuConditionEntity);
	
	/**
     * 添加角色菜单关联
     * 
     * @param roleMenuEntity 角色菜单关联信息
     * @return 结果
     */
	int insert(RoleMenuEntity roleMenuEntity);
	
	/**
     * 修改角色菜单关联
     * 
     * @param roleMenuEntity 角色菜单关联信息
     * @return 结果
     */
	int update(RoleMenuEntity roleMenuEntity);
	
	/**
     * 删除角色菜单关联
     * 
     * @param id 角色菜单关联ID
     * @return 结果
     */
	int deleteById(Long id);
	
}