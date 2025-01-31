package com.jsp.Bank_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsp.Bank_Management_System.dto.Card;
import com.jsp.Bank_Management_System.repo.CardRepo;

@Repository
public class CardDao {

	@Autowired
	CardRepo cardRepo;

	@PostMapping
	public Card saveCard(Card card) {
		return cardRepo.save(card);
	}

	@GetMapping
	public Card fetchCardById(int id) {
		return cardRepo.findById(id).get();
	}

	@GetMapping
	public List<Card> fetchAllCards() {
		return cardRepo.findAll();
	}

	@GetMapping
	public Card updateCard(Card card) {
		return cardRepo.save(card);
	}

	@GetMapping
	public void deleteCardById(int id) {
		cardRepo.deleteById(id);
	}

	@GetMapping
	public void deleteAllCards() {
		cardRepo.deleteAll();
	}
}