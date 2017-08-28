package com.zhiyou100.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.modle.Course;
import com.zhiyou100.service.CourseService;
import com.zhiyou100.service.SubjectService;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	SubjectService ss;
	@Autowired
	CourseService cs;
	@RequestMapping("/courseList.action")
	public String fiandVideoList( Model md,HttpSession session){
		/*System.out.println("course;;;;;;;;;");
		List<Subject> subject= ss.fandAllSubject();
		md.addAttribute("subject", subject);*/
		List<Course> cours = cs.fandAllCourseAndSubjectName();
		System.out.println("ddddddddddddddd"+cours);
		session.setAttribute("cours", cours);
		
		 return "/course/courseList";
		 }


}
