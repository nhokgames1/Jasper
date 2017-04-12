package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.model.Card;
import com.demo.dao.CardDAO;




@Service
public class CardService {
	@Autowired
	private CardDAO carddao;
	
	public List<Card> getAllCard(){
		return carddao.findAll();
	}
	public void delete(Long id) {
		carddao.delete(id);
	}
	public void add(Card card) {
		carddao.save(card);
	}
	public void update(Long id,Card card) {
		Card cd = carddao.findOne(id);
		cd.setNumber(card.getNumber());
		cd.setCLASS(card.getCLASS());
		cd.setOwner(card.getOwner());
		cd.setValid(card.getValid());
		cd.setExpiration(card.getExpiration());
		
		
	}
}
