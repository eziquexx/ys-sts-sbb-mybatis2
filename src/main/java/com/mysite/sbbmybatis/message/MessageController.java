package com.mysite.sbbmybatis.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String getMessageListView() {
		return "messageList";
	}

	@GetMapping("/api")
	@ResponseBody
	public List<Message> getMessagesLimit10() {
		return messageService.getMessagesLimit10();
	}
	
	// insert, create
	@GetMapping("/create")
	public String getMessageCreate() {
		return "messageCreate";
	}
	@PostMapping("/create")
	@ResponseBody
	public void messageCreate(@RequestBody Message message) {
		messageService.messageCreate(message);
	}
}
