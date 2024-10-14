package com.mysite.sbbmybatis.checkStr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.Message;
import com.mysite.sbbmybatis.MessageService;

@Controller
public class CheckWordController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/checkword/{word}")
	@ResponseBody
	public boolean CheckWord(@PathVariable("word") String userWord) {
		// dbWord
		Message message = messageService.getMessage(1);
		String dbWord = message.getMessage();
		
		// String dbWord2 = messageService.getMessageVal(1);
		
		// userWord.equals(dbWord)
		boolean result = userWord.equals(dbWord);
		
		return result;
	}
	
	@GetMapping("/checkwordshtml")
	public String checkwordshtml( ) {
		return "checkwordshtml";
	}
	
	// get으로 요청된 값을 받을 때는 @RequestParam을 사용합니다.
	@GetMapping("/checkwordsget")
	@ResponseBody
	public boolean checkWord2(@RequestParam("word") String userWord) {
		return true;
	}
}
