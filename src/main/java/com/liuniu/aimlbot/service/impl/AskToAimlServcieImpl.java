package com.liuniu.aimlbot.service.impl;

import org.springframework.stereotype.Service;

import com.liuniu.aimlbot.service.AskToAimlService;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;
@Service
public class AskToAimlServcieImpl implements AskToAimlService {

	private static AliceBotMother mother = null;
	private static AliceBot bot = null;

	public AskToAimlServcieImpl() {
		mother = new AliceBotMother();
		mother.setUp();
		try {
			bot = mother.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String response(String input) {
		return bot.respond(input);
	}
}
