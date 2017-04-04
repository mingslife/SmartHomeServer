package com.mingslife.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.dto.CardDTO;
import com.mingslife.model.Card;
import com.mingslife.service.ICardService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/cards")
public class CardController extends BaseController {
	@Autowired
	private ICardService cardService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Card> cards = cardService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("cards", cards);
		return "cards/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Card> cards = cardService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = cardService.count();
		
		jsonMap.put("rows", cards);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Card show(@PathVariable("id") Integer id) {
		Card card = cardService.find(id, new String[] {"id"});
		return card;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute CardDTO cardDTO) {
		cardService.save(cardDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute CardDTO cardDTO, Model model) {
		cardService.update(cardDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		cardService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			cardService.delete(id);
		}
	}
}
