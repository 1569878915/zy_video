package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.CourseMapper;
import com.zhiyou100.modle.Course;
import com.zhiyou100.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseMapper cm;

	@Override
	public List<Course> fandAllCourse() {
		
		return cm.selectByExample(null);
	}

	@Override
	public List<Course> fandAllCourseAndSubjectName() {
		
		return cm.fandAllCourseAndSubjectName();
	}
}
