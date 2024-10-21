package com.dao;

import com.entity.LvyouxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyouxianluVO;
import com.entity.view.LvyouxianluView;


/**
 * 旅游线路
 * 
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
public interface LvyouxianluDao extends BaseMapper<LvyouxianluEntity> {
	
	List<LvyouxianluVO> selectListVO(@Param("ew") Wrapper<LvyouxianluEntity> wrapper);
	
	LvyouxianluVO selectVO(@Param("ew") Wrapper<LvyouxianluEntity> wrapper);
	
	List<LvyouxianluView> selectListView(@Param("ew") Wrapper<LvyouxianluEntity> wrapper);

	List<LvyouxianluView> selectListView(Pagination page,@Param("ew") Wrapper<LvyouxianluEntity> wrapper);
	
	LvyouxianluView selectView(@Param("ew") Wrapper<LvyouxianluEntity> wrapper);
	
}
