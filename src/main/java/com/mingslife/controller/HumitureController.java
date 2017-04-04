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

import com.mingslife.dto.HumitureDTO;
import com.mingslife.model.Humiture;
import com.mingslife.service.IHumitureService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/humitures")
public class HumitureController extends BaseController {
	@Autowired
	private IHumitureService humitureService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Humiture> humitures = humitureService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("humitures", humitures);
		return "humitures/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Humiture> humitures = humitureService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = humitureService.count();
		
		jsonMap.put("rows", humitures);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Humiture show(@PathVariable("id") Integer id) {
		Humiture humiture = humitureService.find(id, new String[] {"id"});
		return humiture;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute HumitureDTO humitureDTO) {
		humitureService.save(humitureDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute HumitureDTO humitureDTO, Model model) {
		humitureService.update(humitureDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		humitureService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			humitureService.delete(id);
		}
	}
}
