package jayks.com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jayks.com.user.service.UserService;
import jayks.com.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public List<UserVO> getUserList(Model model) throws Exception {
		
		log.info("getUserList 컨트롤러 통과 확인 {}");
		
		List<UserVO> list = userService.getUserList();
		
		return list;
	}
}
