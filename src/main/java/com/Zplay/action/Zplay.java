package com.Zplay.action;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/z")
public class Zplay {
	
	@RequestMapping("/video")
    public ModelAndView getVideo(){
		return new ModelAndView("/play");
    	
    }
}
