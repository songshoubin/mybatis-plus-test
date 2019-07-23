package com.xiaodu.mybatisplustest.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.xiaodu.mybatisplustest.entity.ElaJob;
import com.xiaodu.mybatisplustest.mapper.ElaJobMapper;
import com.xiaodu.mybatisplustest.service.IElaJobService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author songshoubin
 * @since 2019-07-23
 */
@Service
public class ElaJobServiceImpl extends ServiceImpl<ElaJobMapper, ElaJob> implements IElaJobService {

    @Autowired
    private ElaJobMapper elaJobMapper;
    @Override
    public Page<ElaJob> getElaJobPage(Integer cur,Integer size) {
        Page<ElaJob> page = new Page<>(cur,size);
        List<ElaJob> elaJobList = elaJobMapper.selectPage(page,new EntityWrapper<ElaJob>().eq("bean_name","visitsTask"));
        page.setRecords(elaJobList);
        return page;
    }
}
