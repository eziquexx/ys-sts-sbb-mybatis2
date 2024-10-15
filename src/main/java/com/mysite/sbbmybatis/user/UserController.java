package com.mysite.sbbmybatis.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	// GET /user/signup
	@GetMapping("/user/signup")
	public String signup() {
		return "/user/signup";
	}
	// POST /user/signup
	@PostMapping("/user/signup")
	public String signup2(@ModelAttribute("user") User user) {
		System.out.println(user.toString());
		userService.addUser(user);
		
		return "redirect:/";
	}
	
	// 자바스크립트처럼 객체로 만들어서 해야한다면 이게 좋다.
	@PostMapping("/user/signup2")
	public void signup22(@RequestParam("username") String username,
			@RequestParam("psw") String psw) {
		
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setPsw(psw);
		userService.addUser(newUser);
	}
	
	
	
	// GET /user/login
	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	// form으로 요청
	// POST /user/login
	@PostMapping("/user/login")
	public String login2(@ModelAttribute("user") User user) {
		boolean isUser = userService.checkUser(user);
		if (isUser) {
		// 로그인 성공
			return "redirect:/";
		} else {
		// 로그인 실패
			return "redirect:/user/login";
		}
	}
}
