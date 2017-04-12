package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Card;

@Transactional
public interface CardDAO extends JpaRepository<Card, Long>{

}
