package com.hrms.test;

import com.hrms.bean.Job;
import com.hrms.mapper.JobMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author:helloboy
 * Date:2019-06-26 17:29
 * Description:<描述>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:springmvc.xml"})
public class JobMapperTest {
    @Autowired
    JobMapper jobMapper;

    @Test
    public void deleteJobByIdTest(){
        int res = jobMapper.deleteJobById(1);
        System.out.println(res);
        System.out.println("删除成功！");
    }

    @Test
    public void updateOneByIdTest(){
        Job job = new Job();
        int res = jobMapper.updateOneById(1, job);
        System.out.println(res);
    }
}
