package com.gsitm.meeting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsitm.meeting.dao.NoticeDaoImpl;
import com.gsitm.meeting.dto.Notice;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDaoImpl dao;
	
	public List<Notice> noticeList(){
		System.out.println("service :" + dao.noticeList());
		return dao.noticeList();
	}
}
