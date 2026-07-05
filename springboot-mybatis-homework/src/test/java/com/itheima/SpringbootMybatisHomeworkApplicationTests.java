package com.itheima;

import com.itheima.entity.Activity;
import com.itheima.entity.Course;
import com.itheima.mapper.ActivityMapper;
import com.itheima.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class SpringbootMybatisHomeworkApplicationTests {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private ActivityMapper activityMapper;
    @Test
    public  void testInsertCourse(){
        Course course = new Course();
        course.setId(null);
        course.setSubject(3);
        course.setName("AI鸿蒙开发");
        course.setPrice(500);
        course.setTarget(2);
        course.setDescription("AI鸿蒙开发课程介绍");
        course.setCreateTime(LocalDateTime.now());
        course.setUpdateTime(LocalDateTime.now());
        courseMapper.insertCourse(course);
    }
    @Test
    public  void testDeleteCourseById(){
        courseMapper.deleteCourseById(15);
    }
    @Test
    public void testUpdateCourse(){
        Course course = new Course();
        course.setId(14);
        course.setSubject(3);
        course.setName("AI鸿蒙开发");
        course.setPrice(15000);
        course.setTarget(2);
        course.setDescription("AI鸿蒙开发课程介绍");
        course.setUpdateTime(LocalDateTime.now());
        courseMapper.updateCourse(course);
    }
    @Test
    public  void testSelectCourseById(){
        Course course = courseMapper.selectCourseById(1);
        System.out.println(course);
    }
    @Test
    public  void testSelectCourseBySNT(){
        List<Course> courses = courseMapper.selectCourseBySNT(null, 3, 2);
        for (Course course : courses) {
            System.out.println(course);
        }
    }
    @Test
    public  void testInsertActivity(){
        Activity activity = new Activity();
        activity.setId(null);
        activity.setChannel(1);
        activity.setName("AI鸿蒙开发课程");
        activity.setStartTime(LocalDateTime.parse("2023-11-15 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        activity.setEndTime(LocalDateTime.parse("2023-11-15 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        activity.setDescription("2023年11月15日-AI鸿蒙开发课程");
        activity.setType(1);
        activity.setDiscount(0.9);
        activity.setVoucher(500);
        activity.setCreateTime(LocalDateTime.now());
        activity.setUpdateTime(LocalDateTime.now());
        activityMapper.insertActivity(activity);
    }
    @Test
    public  void testDeleteActivityById(){
        activityMapper.deleteActivityById(13);
    }
    @Test
    public void testUpdateActivity(){
        Activity activity = new Activity();
        activity.setId(12);
        activity.setChannel(1);
        activity.setName("AI鸿蒙开发课程");
        activity.setStartTime(LocalDateTime.parse("2023-11-15 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        activity.setEndTime(LocalDateTime.parse("2023-11-15 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        activity.setDescription("2023年11月15日-AI鸿蒙开发课程");
        activity.setType(1);
        activity.setDiscount(0.9);
        activity.setVoucher(500);
        activity.setUpdateTime(LocalDateTime.now());
        activityMapper.updateActivity(activity);
    }
    @Test
    public  void testSelectActivityById(){
        Activity activity = activityMapper.selectActivityById(1);
        System.out.println(activity);
    }
    @Test
    public  void testSelectActivityByChannelAndType(){
        List<Activity> activities = activityMapper.selectActivityByChannelAndType(1, 1);
        for (Activity activity : activities) {
            System.out.println(activity);
        }
    }
}
