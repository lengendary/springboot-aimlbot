/**
 * 
 */
package com.liuniu.aimlbot.util;

import com.liuniu.aimlbot.service.impl.AskToAimlServcieImpl;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;

/** 
 * @Description:
 * @author zhouzhenwei
 * @date 2018年12月25日下午12:02:36
 */
public class Test {
	public static void main(String[] args) throws Exception {
		AliceBotMother mother = new AliceBotMother();
		mother.setUp();
		AliceBot bot = mother.newInstance();
		//AskToAimlServcieImpl ask = new AskToAimlServcieImpl();
        //这里你可以自己搞个循环然后输入
		String reMsg = "你好";
		//reMsg = AnalyzerHelp.spaceStr(reMsg);这里分词大家就自己折腾吧我使用的是lucene
		//System.out.println("分词结果：" + reMsg);
		String result = bot.respond(reMsg);
		System.out.println("AI：" + result); 
	}
}
