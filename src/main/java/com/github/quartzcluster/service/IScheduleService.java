package com.github.quartzcluster.service;

import com.github.quartzcluster.support.CronJobDefinition;
import com.github.quartzcluster.support.Key;
import com.github.quartzcluster.support.SimpleJobDefinition;

/** @author zouwei */
public interface IScheduleService {
    /** @param cronJobDefinition */
    void schedule(CronJobDefinition cronJobDefinition);

    /** @param simpleJobDefinition */
    void schedule(SimpleJobDefinition simpleJobDefinition);

    /**
     * 暂停触发器
     *
     * @param key
     */
    void pauseTrigger(Key key);

    /**
     * 恢复触发器
     *
     * @param key
     */
    void resumeTrigger(Key key);

    /**
     * 删除触发器
     *
     * @param key
     * @return
     */
    boolean removeTrigger(Key key);
}