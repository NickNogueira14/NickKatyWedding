/**
 * 
 */
package com.weddingapp.nickkaty.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.googlecode.objectify.Key;
import com.weddingapp.nickkaty.domain.MessageToCouple;
import com.weddingapp.nickkaty.service.IMessageToCoupleService;

/**
 * 
 * 
 * @since 24 de nov de 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 * 
 */
@Controller
@RequestMapping(value = "/messageToCouple")
public class MessageToCoupleController {
	
	@Autowired
	private IMessageToCoupleService messageToCoupleService;
	
	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public MessageToCouple save(@RequestBody MessageToCouple msg){
		msg.setMessageCreate(new Date());
		
		Key<MessageToCouple> key = messageToCoupleService.save(msg);
		
		if(null != key){
			return messageToCoupleService.findById(key.getId());
		} else {
			return new MessageToCouple();
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<MessageToCouple> getAll() {
		List<MessageToCouple> resultList = messageToCoupleService.findAll();
		if(resultList != null && !resultList.isEmpty()) {
			return resultList;
		} else {
			return new ArrayList<MessageToCouple>();
		}
	}

}
