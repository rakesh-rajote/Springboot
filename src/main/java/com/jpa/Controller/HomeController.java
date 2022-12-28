package com.jpa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/rakesh")
	@ResponseBody
	public String gethelp() {
		return "hi takesh";
	}

}
