package com.leo.structural.flyweight.cacheOptimize;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author Leo
 * @date 2023/6/28 16:22
 */
public class ActivityFactory {
    static Map<Long,Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);
        if(null == activity){
            activity =new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id,activity);
        }
        return activity;
    }
}
