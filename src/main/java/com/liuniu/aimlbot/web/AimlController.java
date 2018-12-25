/**
 * 
 */
package com.liuniu.aimlbot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liuniu.aimlbot.service.AskToAimlService;

/** 
 * @Description:
 * @author zhouzhenwei
 * @date 2018年12月25日上午11:33:10
 */
@RestController
@RequestMapping("/aiml")
public class AimlController {
	@Autowired
	private AskToAimlService askAimlService;
	@GetMapping("/ask")
	public String getAnswer(@RequestParam String question){
		String response = askAimlService.response(question);
		return response;
	}

}
