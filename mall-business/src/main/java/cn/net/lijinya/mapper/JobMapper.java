package cn.net.lijinya.mapper;

import cn.net.lijinya.entity.sys.JobConditionEntity;
import cn.net.lijinya.entity.sys.JobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 岗位 mapper
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Mapper
public interface JobMapper {
	/**
     * 查询岗位信息
     * 
     * @param id 岗位ID
     * @return 岗位信息
     */
	JobEntity findById(Long id);
	
	/**
     * 根据条件查询岗位列表
     *
     * @param jobConditionEntity 岗位信息
     * @return 岗位集合
     */
	List<JobEntity> searchByCondition(JobConditionEntity jobConditionEntity);

	/**
	 * 根据条件查询岗位数量
	 *
	 * @param jobConditionEntity 岗位信息
	 * @return 岗位集合
	 */
	int searchCount(JobConditionEntity jobConditionEntity);
	
	/**
     * 添加岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	int insert(JobEntity jobEntity);
	
	/**
     * 修改岗位
     * 
     * @param jobEntity 岗位信息
     * @return 结果
     */
	int update(JobEntity jobEntity);
	
	/**
     * 删除岗位
     * 
     * @param id 岗位ID
     * @return 结果
     */
	int deleteById(Long id);
	
}