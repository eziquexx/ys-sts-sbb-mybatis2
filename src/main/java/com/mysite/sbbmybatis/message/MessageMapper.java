package com.mysite.sbbmybatis.message;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mysite.sbbmybatis.dto.Message;

@Mapper
public interface MessageMapper {

	Message getMessageById(Integer id);
	List<Message> getMessagesLimit10();
	void insertMessage(Message message);
}
