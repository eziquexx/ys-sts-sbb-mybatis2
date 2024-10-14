package com.mysite.sbbmybatis.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.dto.Message;

@Controller
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	// detail
	@GetMapping("/{id}")
	public String getMessage(@PathVariable("id") Integer id, Model model) {
		Message message = messageService.getMessage(id);
		model.addAttribute("msg", message);
		return "messageDetail";
	}
	
	// list
	@GetMapping
	@ResponseBody
	public List<Message> getMessageList(Message message) {
		return messageService.getMessageList(message);
	}
}
