package cn.net.lijinya.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.net.lijinya.mapper.RoleDeptMapper;
import cn.net.lijinya.entity.RoleDeptConditionEntity;
import cn.net.lijinya.entity.RoleDeptEntity;
import cn.net.lijinya.entity.ResponsePageEntity;

/**
 * 角色部门关联 服务层
 * 
 * @author 李进涯 该项目是知识星球：java突击队 的内部项目
 * @date 2026-02-05 17:24:57
 */
@Service
public class RoleDeptService {

	@Autowired
	private RoleDeptMapper roleDeptMapper;

	/**
     * 查询角色部门关联信息
     * 
     * @param id 角色部门关联ID
     * @return 角色部门关联信息
     */
	public RoleDeptEntity findById(Long id) {
	    return roleDeptMapper.findById(id);
	}
	
	/**
     * 根据条件分页查询角色部门关联列表
     * 
     * @param roleDeptConditionEntity 角色部门关联信息
     * @return 角色部门关联集合
     */
	public ResponsePageEntity<RoleDeptEntity> searchByPage(RoleDeptConditionEntity roleDeptConditionEntity) {
		int count = roleDeptMapper.searchCount(roleDeptConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(roleDeptConditionEntity);
		}
		List<RoleDeptEntity> dataList = roleDeptMapper.searchByCondition(roleDeptConditionEntity);
		return ResponsePageEntity.build(roleDeptConditionEntity, count, dataList);
	}
	
    /**
     * 新增角色部门关联
     * 
     * @param roleDeptEntity 角色部门关联信息
     * @return 结果
     */
	public int insert(RoleDeptEntity roleDeptEntity) {
	    return roleDeptMapper.insert(roleDeptEntity);
	}
	
	/**
     * 修改角色部门关联
     * 
     * @param roleDeptEntity 角色部门关联信息
     * @return 结果
     */
	public int update(RoleDeptEntity roleDeptEntity) {
	    return roleDeptMapper.update(roleDeptEntity);
	}

	/**
     * 删除角色部门关联对象
     * 
     * @param id 系统ID
     * @return 结果
     */
	public int deleteById(Long id) {
		return roleDeptMapper.deleteById(id);
	}
	
}
