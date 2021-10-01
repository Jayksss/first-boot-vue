package jayks.com;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	Logger logger;
	
	public String home() {
		
		logger.info("first-boot-vue 입장 >>> ");
		
		return "/index.html";
	}
}
