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

import com.mingslife.dto.FamilyDTO;
import com.mingslife.model.Family;
import com.mingslife.service.IFamilyService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/families")
public class FamilyController extends BaseController {
	@Autowired
	private IFamilyService familyService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Family> families = familyService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("families", families);
		return "families/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Family> families = familyService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = familyService.count();
		
		jsonMap.put("rows", families);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Family show(@PathVariable("id") Integer id) {
		Family family = familyService.find(id, new String[] {"id"});
		return family;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute FamilyDTO familyDTO) {
		familyService.save(familyDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute FamilyDTO familyDTO, Model model) {
		familyService.update(familyDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		familyService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			familyService.delete(id);
		}
	}
}
