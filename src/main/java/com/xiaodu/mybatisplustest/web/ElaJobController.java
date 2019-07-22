package com.xiaodu.mybatisplustest.web;


import com.xiaodu.mybatisplustest.entity.ElaJob;
import com.xiaodu.mybatisplustest.service.IElaJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author songshoubin
 * @since 2019-07-22
 */
@RestController
@RequestMapping("/elaJob")
public class ElaJobController {
    @Autowired
    private IElaJobService elaJobService;

    @GetMapping("/getjob")
    public ResponseEntity getjob(){
        ElaJob elaJob = elaJobService.selectById(1);
        return new ResponseEntity(elaJob, HttpStatus.OK);

    }
}
