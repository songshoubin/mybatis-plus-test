package com.xiaodu.mybatisplustest.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author songshoubin
 * @since 2019-07-23
 */
@TableName("ela_job")
public class ElaJob extends Model<ElaJob> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Spring Bean名称
     */
    @TableField("bean_name")
    private String beanName;

    /**
     * cron 表达式
     */
    @TableField("cron_expression")
    private String cronExpression;

    /**
     * 状态：1暂停、0启用
     */
    @TableField("is_pause")
    private Boolean isPause;

    /**
     * 任务名称
     */
    @TableField("job_name")
    private String jobName;

    /**
     * 方法名称
     */
    @TableField("method_name")
    private String methodName;

    /**
     * 参数
     */
    @TableField("params")
    private String params;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 创建或更新日期
     */
    @TableField("update_time")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
    public Boolean getPause() {
        return isPause;
    }

    public void setPause(Boolean isPause) {
        this.isPause = isPause;
    }
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ElaJob{" +
        "id=" + id +
        ", beanName=" + beanName +
        ", cronExpression=" + cronExpression +
        ", isPause=" + isPause +
        ", jobName=" + jobName +
        ", methodName=" + methodName +
        ", params=" + params +
        ", remark=" + remark +
        ", updateTime=" + updateTime +
        "}";
    }
}
