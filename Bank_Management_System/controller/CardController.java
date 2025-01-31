package com.jsp.Bank_Management_System.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.Bank_Management_System.dto.Card;
import com.jsp.Bank_Management_System.service.CardService;

@RestController
public class CardController {

	@Autowired
	CardService cardService;

	@PostMapping("/saveCard")
	public Card saveCard(@RequestBody Card card) {
		return cardService.saveCard(card);
	}

	@GetMapping("/fetchCardById")
	public Card fetchCardById(@RequestParam int id) {
		return cardService.fetchCardById(id);
	}

	@GetMapping("/fetchAllCards")
	public List<Card> fetchAllCards() {
		return cardService.fetchAllCards();
	}

	@PutMapping("/updateCard")
	public Card updateCard(@RequestParam int id, @RequestBody Card card) {
		card.setCardId(id);
		return cardService.updateCard(card);
	}

	@DeleteMapping("/deleteCardById")
	public String deleteCardById(@RequestParam int id) {
		cardService.deleteCardById(id);
		return "Successfully Deleted";
	}

	@DeleteMapping("/deleteAllCards")
	public String deleteAllCards() {
		cardService.deleteAllCards();
		return "Successfully Deleted All Cards";
	}
}