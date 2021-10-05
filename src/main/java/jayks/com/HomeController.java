package jayks.com;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jayks.com.user.service.UserService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	Logger logger;
	
	@Autowired
	private UserService userService;
	
	public String home() {
		
		logger.info("first-boot-vue 입장 >>> ");
		
		return "/index.html";
	}
}
