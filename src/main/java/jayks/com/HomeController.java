package jayks.com;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
//    @GetMapping("/user/list")
//    public void getUserList(Model model) throws Exception {
//    	
//    	List<UserVO> list = userService.getUserList();
//    }
    
    @GetMapping("/user/list")
    public String getUserList(Model model) throws Exception {
    	
    	List<UserVO> list = userService.getUserList();
    	
		return list.toString();
    }
}
