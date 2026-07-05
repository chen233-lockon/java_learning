package com.itheima.mapper;

import com.itheima.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {
    @Insert("insert into course (id, subject, name, price, target, description, create_time, update_time) values (#{id},#{subject},#{name},#{price},#{target},#{description},#{createTime},#{updateTime})")
    public  void  insertCourse(Course  course);
    @Delete("delete from course where id = #{id}")
    public  void deleteCourseById(Integer id);
    @Update("update course set subject= #{subject},name = #{name},price = #{price},target = #{target},description = #{description},update_time = #{updateTime} where id = #{id}")
    public  void updateCourse(Course course);
    @Select("select * from course where id = #{id}")
    public  Course selectCourseById(Integer id);
    public List<Course> selectCourseBySNT(String name, Integer subject, Integer target);
}

