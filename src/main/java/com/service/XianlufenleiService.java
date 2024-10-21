package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianlufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianlufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianlufenleiView;


/**
 * 线路分类
 *
 * @author 
 * @email 
 * @date 2021-03-03 15:13:59
 */
public interface XianlufenleiService extends IService<XianlufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianlufenleiVO> selectListVO(Wrapper<XianlufenleiEntity> wrapper);
   	
   	XianlufenleiVO selectVO(@Param("ew") Wrapper<XianlufenleiEntity> wrapper);
   	
   	List<XianlufenleiView> selectListView(Wrapper<XianlufenleiEntity> wrapper);
   	
   	XianlufenleiView selectView(@Param("ew") Wrapper<XianlufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianlufenleiEntity> wrapper);
   	
}

