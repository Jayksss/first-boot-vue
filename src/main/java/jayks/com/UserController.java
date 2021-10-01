package jayks.com;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	Logger logger;
	
	@GetMapping("/list")
	public String getUserList(Model model) throws Exception {
		
		String str = "getUserList" ;
		model.addAttribute(str, str);
		
		return str;
	}
}
