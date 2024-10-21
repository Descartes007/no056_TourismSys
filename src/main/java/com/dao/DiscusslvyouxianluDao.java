package com.dao;

import com.entity.DiscusslvyouxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvyouxianluVO;
import com.entity.view.DiscusslvyouxianluView;


/**
 * 旅游线路评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
public interface DiscusslvyouxianluDao extends BaseMapper<DiscusslvyouxianluEntity> {
	
	List<DiscusslvyouxianluVO> selectListVO(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
	
	DiscusslvyouxianluVO selectVO(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
	
	List<DiscusslvyouxianluView> selectListView(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);

	List<DiscusslvyouxianluView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
	
	DiscusslvyouxianluView selectView(@Param("ew") Wrapper<DiscusslvyouxianluEntity> wrapper);
	
}
