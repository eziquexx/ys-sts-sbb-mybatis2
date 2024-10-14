package com.mysite.sbbmybatis.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.sbbmybatis.dto.Message;
import com.mysite.sbbmybatis.dto.PageDTO;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	public Message getMessage(Integer id) {
		return messageMapper.getMessageById(id);
	}
	
	public PageDTO getPageData(int page, int size) {
		int offset = (page - 1) * size;
		List<Message> content = messageMapper.getMessagesWithPaging(size, offset);
		int totalElements = messageMapper.countTotal();
        int totalPages = (int) Math.ceil((double) totalElements / size);
		
		return new PageDTO(page, size, totalPages, totalElements, content);
	}
	public List<Message> getMessagesLimit10() {
		return messageMapper.getMessagesLimit10();
	}
	
	public void messageCreate(Message message) {
		messageMapper.insertMessage(message);
	}
	
	
}
