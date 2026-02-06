package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.sys.MenuConditionEntity;
import cn.net.lijinya.entity.sys.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface MenuMapper {
	/**
     * 查询菜单信息
     * 
     * @param id 菜单ID
     * @return 菜单信息
     */
	MenuEntity findById(Long id);
	
	/**
     * 根据条件查询菜单列表
     *
     * @param menuConditionEntity 菜单信息
     * @return 菜单集合
     */
	List<MenuEntity> searchByCondition(MenuConditionEntity menuConditionEntity);

	/**
	 * 根据条件查询菜单数量
	 *
	 * @param menuConditionEntity 菜单信息
	 * @return 菜单集合
	 */
	int searchCount(MenuConditionEntity menuConditionEntity);
	
	/**
     * 添加菜单
     * 
     * @param menuEntity 菜单信息
     * @return 结果
     */
	int insert(MenuEntity menuEntity);
	
	/**
     * 修改菜单
     * 
     * @param menuEntity 菜单信息
     * @return 结果
     */
	int update(MenuEntity menuEntity);
	
	/**
     * 删除菜单
     * 
     * @param id 菜单ID
     * @return 结果
     */
	int deleteById(Long id);
	
}