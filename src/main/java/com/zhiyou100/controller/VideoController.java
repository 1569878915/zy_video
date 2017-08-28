package com.zhiyou100.controller;


import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou100.modle.Course;
import com.zhiyou100.modle.QueryVO;
import com.zhiyou100.modle.Speaker;
import com.zhiyou100.modle.Video;
import com.zhiyou100.service.CourseService;
import com.zhiyou100.service.SpeakerService;
import com.zhiyou100.service.VideoService;
import com.zhiyou100.util.Page;

@Controller
@RequestMapping("/video")
public class VideoController {
	@Autowired
	VideoService vs;
	@Autowired
	CourseService cs;
	@Autowired
	SpeakerService ss;
/*
	@RequestMapping(value = "/videoList.action", method = RequestMethod.GET)
	public String fiandTheVideoList() {

		return "/video/videoList";

	}*/

	@RequestMapping(value = "/videoList.action")
	public String fiandVideoList(
			@RequestParam(value = "videoTitleKeyWord", required = true, defaultValue = "") String videoTitleKeyWord,
			@RequestParam(value = "speakerSearchField", required = true, defaultValue = "") String speakerSearchField,
			@RequestParam(value = "courseSearchField", required = true, defaultValue = "") String courseSearchField,
			@RequestParam(value = "page", required = true, defaultValue = "1") Integer page, Model md , HttpSession session) {
		//System.out.println(page+"----"+courseSearchField+"--------"+videoTitleKeyWord+"----"+speakerSearchField);
		md.addAttribute("videoTitleKeyWord", videoTitleKeyWord);
		md.addAttribute("speakerSearchField", speakerSearchField);
		md.addAttribute("courseSearchField", courseSearchField);
		QueryVO qv = new QueryVO();
		qv.setPage(page);
		qv.setBegan((page - 1) * 5);
		qv.setCourseSearchField(courseSearchField);
		qv.setVideoTitleKeyWord(videoTitleKeyWord);
		qv.setSpeakerSearchField(speakerSearchField);
		Page<Video> page1 = vs.loadPage(qv);
		md.addAttribute("page", page1);
		List<Course> course = cs.fandAllCourse();
    /*	md.addAttribute("course", course);*/
    	session.setAttribute("course", course);
		List<Speaker> speaker = ss.fandAllSpeaker();
		session.setAttribute("speaker", speaker);
		//md.addAttribute("speaker", speaker);

		return "/video/videoList";

	}
	@RequestMapping(value ="/addVideo.action" ,method=RequestMethod.GET)
	public String addVideo(
			){
		
		
		return "/video/addVideo";
		
		
	}
	@RequestMapping(value ="/addVideo.action",method=RequestMethod.POST )
	public String addVideoa(
			Video v
	){
		
		vs.insertIntoByVideoVO(v);
		return "redirect:/video/videoList.action";	
		}
		@RequestMapping(value ="/updateVideo.action",method=RequestMethod.GET )
		public String updateVideoa(
				Integer id,Model md
				){
		//	System.out.println("aaaaaaaaaaaaaa"+id);
			Video video= vs.fandAllVideoById(id);
			md.addAttribute("video", video);
		//	System.out.println(video);
			return "/video/updateVideo";	
	}
		@RequestMapping(value ="/updateVideo.action",method=RequestMethod.POST )
		public String updateVideoaa( 
			Video vp
		){  System.out.println("sssssssssss"+vp);
		vs.updateVideo(vp);
			/*System.out.println(v+"dddddddddd");
			//System.out.println(id);
			vs.updateVideo(v);*/
			//return "/video/videoList";
		return "redirect:/video/videoList.action";	
			}
		@RequestMapping(value ="/deleteVideo.action" )
		public String deleteVideo(
				Integer id,Model md
				){
			System.out.println("aaaaaaaaaaaaaa"+id);
			vs.deleteVideoById(id);
			
			return "redirect:/video/videoList.action";	
	}
		//batchDeleteVideo.action
		@RequestMapping(value ="/batchDeleteVideo.action" )
		public String batchDeleteVideo(
			Integer [] ids
				){
			System.out.println(Arrays.toString(ids));
			
			
			List<Integer> list=Arrays.asList(ids);
		//	vs.deleteVideoById("");
			//"Admin [id=" + id + ", loginName=" + loginName + ",
			//loginPwd=" + loginPwd + "]";
// String hobbys=hobbys.substring(1, hobbys.length -1);
/*String[] a = hobbys.split(",");
 List<String> list = new ArrayList<String>();
 for(int i=0; i<a.length; i++){
     String b = a[i].trim();
     list.add(b);
 }		
	*/
 
 // hobbys=
		//	String
			//vs.deleteVideoByIds(hobbys);
			
			
			return "redirect:/video/videoList.action";	
	}
}
