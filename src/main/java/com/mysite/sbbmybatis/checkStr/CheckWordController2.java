package com.mysite.sbbmybatis.checkStr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.Message;
import com.mysite.sbbmybatis.MessageService;

@Controller
public class CheckWordController2 {
//	@Autowired
//	private MessageService messageService;
//
//	// checkword/{word}로 접근시 사용자가 입력한 word와 DB에 있는 word를 비교하여
//	// 값이 있으면 true, 없으면 false를 반환한다.
//	@GetMapping("/checkword/{word}")
//	@ResponseBody
//	public boolean CheckWord(@PathVariable("word") String userWord) {
//		// /checkword/{word} root에서 사용자가 입력한 word를 userWord라는 변수에 저장.
//		
//		Message message = messageService.getMessage(1);
//		// DB에 있는 word와 비교하기 위해서는 DB에 접근하여 값을 가져와야한다.
//		// 그러기 때문에 service > mapper > db 이렇게 접근하여 가져와야하기 때문에 기존에 입력한
//		// messageService, messageMapper에서 작성한 getMessage() 메서드를 사용하자.
//		
//		String dbWord = message.getMessage();
//		// String데이터 타입의 dbWord 변수를 만들어서 message 인스턴스에 담은 id 1값의 message의 내용(DB에 저장된 id가 1인 message의 값)을 저장.
//		
//		boolean result = userWord.equals(dbWord);
//		// 사용자가 입력한 word와 DB에 저장된 word가 같은지 equals() 메서드를 통해 비교하여
//		// booelan데이터 타입의 result에 결과값을 저장.
//		
//		return result;
//		// result를 return. 즉 반환한다는 의미이며 브라우저 화면 결과값 그대로 출력한다는 의미.
//	}
//	
//	
//	
//	// checkwordshtml 경로로 접근할 때 checkwordshtml.html이 브라우저 화면에 출력.
//	@GetMapping("/checkwordshtml")
//	public String checkwordshtml( ) {
//		return "checkwordshtml";
//	}
//	
//	// get으로 요청된 값을 받을 때는 @RequestParam을 사용합니다.
//	@GetMapping("/checkwordsget")
//	@ResponseBody
//	public boolean checkWord2(@RequestParam("word") String userWord) {
//		return true;
//	}
}
