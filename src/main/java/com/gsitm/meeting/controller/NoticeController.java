package com.gsitm.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.gsitm.meeting.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("/notice/list")
	public String noticeList(Model model) {
		
		//model.addAttribute("list", service.noticeList());
		model.addAttribute("test","test");
		System.out.println("ctl : "+service.noticeList());
		return "notice/noticeList";
	}
}
