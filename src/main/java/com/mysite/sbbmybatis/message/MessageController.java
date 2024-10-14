package com.mysite.sbbmybatis.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.dto.Message;

@Controller
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	//detail
	@GetMapping("/messages/{id}")
	@ResponseBody
	public Message getMessage(@PathVariable("id") Integer id) {
		return messageService.getMessage(id);
	}
}
