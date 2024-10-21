package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuixinxianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuixinxianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuixinxianluView;


/**
 * 最新线路
 *
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
public interface ZuixinxianluService extends IService<ZuixinxianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuixinxianluVO> selectListVO(Wrapper<ZuixinxianluEntity> wrapper);
   	
   	ZuixinxianluVO selectVO(@Param("ew") Wrapper<ZuixinxianluEntity> wrapper);
   	
   	List<ZuixinxianluView> selectListView(Wrapper<ZuixinxianluEntity> wrapper);
   	
   	ZuixinxianluView selectView(@Param("ew") Wrapper<ZuixinxianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuixinxianluEntity> wrapper);
   	
}

