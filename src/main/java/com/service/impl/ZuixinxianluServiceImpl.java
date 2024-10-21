package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuixinxianluDao;
import com.entity.ZuixinxianluEntity;
import com.service.ZuixinxianluService;
import com.entity.vo.ZuixinxianluVO;
import com.entity.view.ZuixinxianluView;

@Service("zuixinxianluService")
public class ZuixinxianluServiceImpl extends ServiceImpl<ZuixinxianluDao, ZuixinxianluEntity> implements ZuixinxianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuixinxianluEntity> page = this.selectPage(
                new Query<ZuixinxianluEntity>(params).getPage(),
                new EntityWrapper<ZuixinxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuixinxianluEntity> wrapper) {
		  Page<ZuixinxianluView> page =new Query<ZuixinxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuixinxianluVO> selectListVO(Wrapper<ZuixinxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuixinxianluVO selectVO(Wrapper<ZuixinxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuixinxianluView> selectListView(Wrapper<ZuixinxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuixinxianluView selectView(Wrapper<ZuixinxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
