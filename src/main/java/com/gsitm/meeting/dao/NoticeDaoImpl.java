package com.gsitm.meeting.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsitm.meeting.dto.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao {

	@Autowired
	private NoticeDao dao;
	
	@Override
	public List<Notice> noticeList() {
		return dao.noticeList();
		
	}
	

}
