package com.xiaodu.mybatisplustest.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.xiaodu.mybatisplustest.entity.ElaJob;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author songshoubin
 * @since 2019-07-23
 */
public interface IElaJobService extends IService<ElaJob> {
    public Page<ElaJob> getElaJobPage(Integer cur, Integer size);
}
