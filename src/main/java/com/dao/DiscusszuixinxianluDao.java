package com.dao;

import com.entity.DiscusszuixinxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuixinxianluVO;
import com.entity.view.DiscusszuixinxianluView;


/**
 * 最新线路评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-03 15:14:00
 */
public interface DiscusszuixinxianluDao extends BaseMapper<DiscusszuixinxianluEntity> {
	
	List<DiscusszuixinxianluVO> selectListVO(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
	
	DiscusszuixinxianluVO selectVO(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
	
	List<DiscusszuixinxianluView> selectListView(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);

	List<DiscusszuixinxianluView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
	
	DiscusszuixinxianluView selectView(@Param("ew") Wrapper<DiscusszuixinxianluEntity> wrapper);
	
}
