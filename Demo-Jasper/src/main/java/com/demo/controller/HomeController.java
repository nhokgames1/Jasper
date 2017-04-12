package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Card;
import com.demo.service.CardService;

@RestController
public class HomeController {
	@Autowired
	private CardService cardservice;
	
	@RequestMapping(value = "/getAllCard", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public List<Card> getAllCard() {
		return cardservice.getAllCard();
	}
	@RequestMapping(value="/add", method=RequestMethod.POST,produces ={ "application/json;charset=UTF-8" })
	@ResponseBody
	public void add(@RequestBody Card  card) {
			cardservice.add(card);
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id")Long id) {
		cardservice.delete(id);
	}
	
}
