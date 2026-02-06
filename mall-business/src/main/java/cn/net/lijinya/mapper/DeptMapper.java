package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.DeptConditionEntity;
import cn.net.lijinya.entity.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface DeptMapper {
	/**
     * 查询部门信息
     * 
     * @param id 部门ID
     * @return 部门信息
     */
	DeptEntity findById(Long id);
	
	/**
     * 根据条件查询部门列表
     *
     * @param deptConditionEntity 部门信息
     * @return 部门集合
     */
	List<DeptEntity> searchByCondition(DeptConditionEntity deptConditionEntity);

	/**
	 * 根据条件查询部门数量
	 *
	 * @param deptConditionEntity 部门信息
	 * @return 部门集合
	 */
	int searchCount(DeptConditionEntity deptConditionEntity);
	
	/**
     * 添加部门
     * 
     * @param deptEntity 部门信息
     * @return 结果
     */
	int insert(DeptEntity deptEntity);
	
	/**
     * 修改部门
     * 
     * @param deptEntity 部门信息
     * @return 结果
     */
	int update(DeptEntity deptEntity);
	
	/**
     * 删除部门
     * 
     * @param id 部门ID
     * @return 结果
     */
	int deleteById(Long id);
	
}