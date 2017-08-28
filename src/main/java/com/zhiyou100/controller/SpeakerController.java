package com.zhiyou100.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou100.modle.Speaker;
import com.zhiyou100.modle.SpeakerVO;
import com.zhiyou100.service.SpeakerService;
import com.zhiyou100.util.Page;

@Controller
@RequestMapping("/speaker")
public class SpeakerController {
	@Autowired
	SpeakerService ss;
	@RequestMapping(value = "/speakerList.action")
	public String fiandVideoList(
			@RequestParam(value = "speakerSearchField", required = true, defaultValue = "") String speakerSearchField,
			@RequestParam(value = "jobSearchField", required = true, defaultValue = "") String jobSearchField,
			@RequestParam(value = "page", required = true, defaultValue = "1") Integer page, Model md , HttpSession session) {
		System.out.println(page+"----"+jobSearchField+"------------"+speakerSearchField);
		md.addAttribute("speakerSearchField", speakerSearchField);
		md.addAttribute("jobSearchField", jobSearchField);
		SpeakerVO sv = new SpeakerVO();
		sv.setPage(page);
		sv.setBegan((page - 1) * 3);
		sv.setJobSearchField(jobSearchField);
		sv.setSpeakerSearchField(speakerSearchField);
		System.out.println(sv);
		Page<Speaker> page1 = ss.loadPage(sv);
		System.out.println("dddddddddddddd"+page1);
	//	Page<Video> page1 = ss.loadPage(qv);
		//md.addAttribute("page", page1);
		md.addAttribute("page", page1);
		//speaker.
		List<Speaker> speaker = ss.fandAllSpeaker();
		session.setAttribute("speaker", speaker);

		return "/speaker/speakerList";

	}
	@RequestMapping(value ="/addSpeaker.action" ,method=RequestMethod.GET)
	public String addVideo(
			){
		
		
		return "/speaker/addSpeaker";
		}
	@RequestMapping(value ="/addSpeaker.action",method=RequestMethod.POST )
	public String addVideoa(
			Speaker s
	){
		//System.out.println(s+"aaaaaaaaa");
		ss.insertIntoBySpeaker(s);
		return "redirect:/speaker/speakerList.action";	
		}
		@RequestMapping(value ="/updateSpeaker.action",method=RequestMethod.GET )
		public String updateVideoa(
				Integer id,Model md
				){
			//System.out.println("aaaaaaaaaaaaaa"+id);
			Speaker speaker= ss.fandAllSpeakerById(id);
			md.addAttribute("speaker", speaker);
			System.out.println(speaker);
			return "/speaker/updateSpeaker";	
	}
		
		@RequestMapping(value ="/updateSpeaker.action",method=RequestMethod.POST )
		public String updateVideoaaa(
				Speaker sp,Integer id
				){
			System.out.println("updateSpeaker"+"id="+id);
			ss.updateSpeaker(sp);
			System.out.println("updateSpeaker"+"id="+id);
			//return null;
			return "redirect:/speaker/speakerList.action";	
	}
	
		@RequestMapping(value ="/deleteSpeaker.action" )
		public String deleteVideo( Integer id
				){
			System.out.println("aaaaaaaa"+id);
			ss.deleteSpeakerById(id);
			return  "redirect:/speaker/speakerList.action";
			}
		
}
