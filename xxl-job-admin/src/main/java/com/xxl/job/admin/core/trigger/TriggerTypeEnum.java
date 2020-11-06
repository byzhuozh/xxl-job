package com.xxl.job.admin.core.trigger;

import com.xxl.job.admin.core.util.I18nUtil;

/**
 * trigger type enum
 *
 * 任务触发类型
 *
 * @author xuxueli 2018-09-16 04:56:41
 */
public enum TriggerTypeEnum {

    MANUAL(I18nUtil.getString("jobconf_trigger_type_manual")),  //手动触发任务
    CRON(I18nUtil.getString("jobconf_trigger_type_cron")),  //时间自动触发任务
    RETRY(I18nUtil.getString("jobconf_trigger_type_retry")), //重试触发任务
    PARENT(I18nUtil.getString("jobconf_trigger_type_parent")),   //父job触发子job-就是job执行有先后关系
    API(I18nUtil.getString("jobconf_trigger_type_api")),   //API 调用触发
    MISFIRE(I18nUtil.getString("jobconf_trigger_type_misfire"));

    private TriggerTypeEnum(String title){
        this.title = title;
    }
    private String title;
    public String getTitle() {
        return title;
    }

}
