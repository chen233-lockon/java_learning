package com.itheima.mapper;

import com.itheima.entity.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityMapper {
    public void insertActivity(Activity activity);
    public  void deleteActivityById(Integer id);
    public  void updateActivity(Activity activity);
    public Activity selectActivityById(Integer id);
    public List<Activity> selectActivityByChannelAndType(Integer channel, Integer type);
}
