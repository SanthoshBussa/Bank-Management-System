package com.jsp.Bank_Management_System.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.CardDao;
import com.jsp.Bank_Management_System.dto.Card;

@Service
public class CardService {

	@Autowired
	CardDao cardDao;

	public Card saveCard(Card card) {
		return cardDao.saveCard(card);
	}

	public Card fetchCardById(int id) {
		return cardDao.fetchCardById(id);
	}

	public List<Card> fetchAllCards() {
		return cardDao.fetchAllCards();
	}

	public Card updateCard(Card card) {
		return cardDao.updateCard(card);
	}

	public void deleteCardById(int id) {
		cardDao.deleteCardById(id);
	}

	public void deleteAllCards() {
		cardDao.deleteAllCards();
	}
}