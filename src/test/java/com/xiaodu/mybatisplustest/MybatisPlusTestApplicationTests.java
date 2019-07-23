package com.xiaodu.mybatisplustest;

import com.xiaodu.mybatisplustest.entity.ElaJob;
import com.xiaodu.mybatisplustest.mapper.ElaJobMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.xiaodu.mybatisplustest.mapper")
public class MybatisPlusTestApplicationTests {

    @Autowired
    private ElaJobMapper elaJobDao;
    @Test
    public void contextLoads() {
        ElaJob elaJob = elaJobDao.selectById(1);
        System.out.println(elaJob.toString());
    }

}
