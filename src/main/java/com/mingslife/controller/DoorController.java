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

import com.mingslife.dto.DoorDTO;
import com.mingslife.model.Door;
import com.mingslife.service.IDoorService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/doors")
public class DoorController extends BaseController {
	@Autowired
	private IDoorService doorService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Door> doors = doorService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("doors", doors);
		return "doors/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Door> doors = doorService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = doorService.count();
		
		jsonMap.put("rows", doors);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Door show(@PathVariable("id") Integer id) {
		Door door = doorService.find(id, new String[] {"id"});
		return door;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute DoorDTO doorDTO) {
		doorService.save(doorDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute DoorDTO doorDTO, Model model) {
		doorService.update(doorDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		doorService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			doorService.delete(id);
		}
	}
}
