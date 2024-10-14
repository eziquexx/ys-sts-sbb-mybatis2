package com.mysite.sbbmybatis.message;

import org.apache.ibatis.annotations.Mapper;

import com.mysite.sbbmybatis.dto.Message;

@Mapper
public interface MessageMapper {

	Message getMessageById(Integer id);
}
