package com.xiaodu.mybatisplustest.web;


import com.xiaodu.mybatisplustest.service.IElaJobService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.naming.ReferralException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author songshoubin
 * @since 2019-07-23
 */
@RestController
@RequestMapping("/ela-job")
public class ElaJobController {

    @Autowired
    private IElaJobService iElaJobService;
    @GetMapping("/getpage")
    public ResponseEntity getElaJobPage(Integer cur,Integer size){
        return new ResponseEntity(iElaJobService.getElaJobPage(cur,size), HttpStatus.OK);
    }

}
