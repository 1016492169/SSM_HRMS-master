package com.hrms.service;

import com.hrms.bean.Employee;
import com.hrms.bean.Job;
import com.hrms.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:helloboy
 * Date:2019-06-26 15:54
 * Description:<描述>
 */
@Service
public class JobService {
    @Autowired
    JobMapper jobMapper;
    public int deletJobById(Integer deptId){
        return jobMapper.deleteJobById(deptId);
    }

    public int updateJobById(Integer jobId, Job job){return jobMapper.updateOneById(jobId, job);}
}
