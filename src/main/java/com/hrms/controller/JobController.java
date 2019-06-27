package com.hrms.controller;

import com.hrms.service.JobService;
import com.hrms.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:helloboy
 * Date:2019-06-26 15:15
 * Description:<描述>
 */
@Controller
@RequestMapping(value = "/hrms/job")
public class JobController {
    @Autowired
    JobService jobService;
    @RequestMapping(value = "/jobId/{jobId}", method = RequestMethod.DELETE)
    @ResponseBody
    public JsonMsg deleteDept(@PathVariable("jobId") Integer jobId){
        int res = 0;
        if (jobId > 0){
            res = jobService.deletJobById(jobId);
        }
        if (res != 1){
            return JsonMsg.fail().addInfo("del_dept_error", "删除异常");
        }
        return JsonMsg.success();
    }



}
