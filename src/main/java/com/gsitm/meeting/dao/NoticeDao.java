package com.gsitm.meeting.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.gsitm.meeting.dto.Notice;

public interface NoticeDao {
	
	public List<Notice> noticeList();
}
