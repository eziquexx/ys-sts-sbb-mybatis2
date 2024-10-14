package com.mysite.sbbmybatis.message;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mysite.sbbmybatis.dto.Message;

@Mapper
public interface MessageMapper {

	Message getMessageById(Integer id);
	List<Message> getMessagesLimit10();
	List<Message> getMessagesWithPaging(@Param("size") Integer size, @Param("offset") Integer offset);
	int countTotal();
	void insertMessage(Message message);
}
