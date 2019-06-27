package com.hrms.mapper;

import com.hrms.bean.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

/**
 * Author:helloboy
 * Date:2019-06-26 15:54
 * Description:<描述>
 */
public interface JobMapper {
    String TABLE_NAME = "tbl_job";
    String INSERT_FIELDS = "job_name, job_remark";
    String SELECT_FIELDS = "job_id as 'jobId', " +
            "job_name as 'jobName', " +
            "job_remark as 'jobRemark'";


    /**
     * =================================删除============================================
     */
    @Delete({"DELETE FROM", TABLE_NAME, "WHERE job_id=#{jobId}"})
    int deleteJobById(@Param("jobId") Integer deptId);

    /**
     * ================================= 修改 ============================================
     */
    int updateOneById(@Param("jobId") Integer jobId,
                      @Param("job") Job job);
}
